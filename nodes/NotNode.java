package nodes;

import type.BoolType;
import type.IType;
import exceptions.TypeException;
import symboltable.SymbolTable;
import codegen.VM.Label;

import java.util.ArrayList;

public class NotNode implements INode {

    private INode value;

    public NotNode(INode value) {
        this.value = value;
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {
        System.out.print("NotNode: checkSemantics -> \n" /*+ env.toString() + "\n"*/);
        return new ArrayList<>();
    }

    @Override
    public IType typeCheck() throws TypeException {
        System.out.print("NotNode: typeCheck ->\t");
        return new BoolType();
    }

    @Override
    public String codeGeneration() {

        //TODO test codegen

        String label = Label.nuovaLabelString("Not");
        String exit = Label.nuovaLabelString("Exit");
        return value.codeGeneration() +
                "push 1\n" +
                "beq " + label + "\n" +
                "push 1\n" +
                "b " + exit + "\n" +
                label + ":\n" +
                "push 0\n" +
                exit + ":\n";
    }
}