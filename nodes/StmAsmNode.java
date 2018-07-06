package nodes;

import exceptions.TypeException;
import exceptions.UndeclaredIDException;
import type.IType;
import parser.FOOLParser.StmAssignmentContext;
import type.ObjectType;
import type.VoidType;
import util.Semantic.SymbolTable;
import util.Semantic.SymbolTableEntry;

import java.util.ArrayList;

public class StmAsmNode implements INode {

    private String id;
    private INode exp;
    private StmAssignmentContext stmAssignmentContext;

    private int nestingLevel;
    private SymbolTableEntry entry;
    private IType idType;

    public StmAsmNode(String id, INode e, StmAssignmentContext c) {
        this.exp = e;
        this.stmAssignmentContext = c;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {
        System.out.print("StmAsmNode: checkSemantics -> \n" /*+ env.toString() + "\n"*/);
        ArrayList<String> res = new ArrayList<>();


        try {
            idType = env.getTypeOf(id);
            entry = env.processUseIgnoreFun(id);
            nestingLevel = env.getNestingLevel();
        } catch (UndeclaredIDException e) {
            res.add(id + ": identificativo non definito\n");
        }


        res.addAll(exp.checkSemantics(env));


        // evitare instanziazioni multiple
        if (exp instanceof NewNode) {
            if (entry.isInstanziato()) {
                res.add("L'oggetto '" + id + "' è già stato istanziato\n");
            } else {
                entry.setInstanziato(true);
            }
        } else if (exp instanceof NullNode) {
            // TODO gestire NULL NODE nell IN
            // al mometo viene restituito errore durante il Type Check
        }

        return res;
    }

    @Override
    public IType typeCheck() throws TypeException {
        System.out.print("StmAsmNode: typeCheck -> \t");
        if (!exp.typeCheck().isSubType(idType)) {
            throw new TypeException("Valore incompatibile per la variabile " + id, stmAssignmentContext.exp());
        }
        return new VoidType();
    }

    @Override
    public String codeGeneration() {
        //TODO codegen
        return exp.codeGeneration() + "\n";
    }
}
