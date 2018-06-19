package ast;


import Type.BoolType;
import Type.IType;
import exceptions.TypeException;
import util.Semantic.SymbolTable;

import java.util.ArrayList;

public class BoolNode implements INode {

    private boolean value;

    public BoolNode(boolean value) {
        this.value = value;
    }

    @Override
    public String toPrint(String indent) {
        return indent + " Bool: " + value + "\n";
    }

    @Override
    public IType typeCheck() throws TypeException {
        return new BoolType();
    }

    @Override
    public String codeGeneration() {
        if (value)
            return "push " + 1 + "\n";
        else {
            return "push " + 0 + "\n";
        }
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {
        System.out.print("BoolNode: checkSemantics -> \n");
        return new ArrayList<>(); //non crea livelli di scope
    }
}
