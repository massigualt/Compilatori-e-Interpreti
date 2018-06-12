package ast;


import Type.IType;
import exceptions.TypeException;
import util.Semantic.SymbolTable;
import util.Semantic.SymbolTableEntry;
import util.VM.FunctionCode;


import java.util.ArrayList;
import java.util.HashMap;

public class ProgLetInNode implements INode {

    private ArrayList<INode> declarationArrayList;
    private INode expression;

    public ProgLetInNode(ArrayList<INode> dec, INode e) {
        declarationArrayList = dec;
        expression = e;
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {
        ArrayList<String> res = new ArrayList<>();

        HashMap<String, SymbolTableEntry> hashMap = new HashMap<>();
        //entro in un nuovo livello di scope
        env.pushHashMap(hashMap);
        //parte Let
        //CheckSemantic nella lista di dichiarazioni
        if (declarationArrayList.size() > 0) {
            env.setOffset(-2);
            //Checksemantic nei figli
            for (INode n : declarationArrayList)
                res.addAll(n.checkSemantics(env));
        }

        //Parte In
        res.addAll(expression.checkSemantics(env));

        //lascio il vecchio scope
        env.popHashMap();

        return res;
    }

    /*
        @Override
        public String toPrint(String indent) {
            return indent;
        }
    */
    @Override
    public IType typeCheck() throws TypeException {
        //parte let
        for (INode dec : declarationArrayList)
            dec.typeCheck();
        //parte in
        return expression.typeCheck();
    }

    @Override
    public String codeGeneration() {
        StringBuilder declCode = new StringBuilder();
        for (INode dec : declarationArrayList)
            declCode.append(dec.codeGeneration());
        return "push 0\n" +
                declCode +
                expression.codeGeneration() + "halt\n" +
                FunctionCode.getFunctionsCode();
    }

}
