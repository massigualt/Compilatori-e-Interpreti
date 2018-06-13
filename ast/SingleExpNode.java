package ast;

import Type.IType;
import exceptions.TypeException;
import util.Semantic.SymbolTable;

import java.util.ArrayList;

public class SingleExpNode implements INode {

    INode expression;

    public SingleExpNode(INode expression) {
        this.expression = expression;
    }

    @Override
    public IType typeCheck() throws TypeException {
        return expression.typeCheck();
    }

    @Override
    public String codeGeneration() {
        return expression.codeGeneration() + "halt\n";
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {

        return expression.checkSemantics(env);
    }
}