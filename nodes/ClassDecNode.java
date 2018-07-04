package nodes;

import exceptions.MultipleIDException;
import exceptions.TypeException;
import exceptions.UndeclaredIDException;
import type.ClassType;
import type.FunType;
import type.IType;
import util.Semantic.Field;
import util.Semantic.Method;
import util.Semantic.SymbolTable;
import util.Semantic.SymbolTableEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class ClassDecNode implements INode {

    private ArrayList<ClassNode> classDeclarationsArrayList;
    private LetInNode letInNode;

    public ClassDecNode(ArrayList<ClassNode> classDeclarationsArrayList, LetInNode letInNode) {
        this.classDeclarationsArrayList = classDeclarationsArrayList;
        this.letInNode = letInNode;
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {
        ArrayList<String> res = new ArrayList<>();

        // crea un nuovo livello di scope
        HashMap<String, SymbolTableEntry> hm = new HashMap<>();
        env.pushHashMap(hm);

        for (ClassNode classNode : classDeclarationsArrayList) {
            try {
                // definisco la classe con tutti i suoi campi e metodi
                ArrayList<Field> fieldArrayList = new ArrayList<>();
                ArrayList<Method> methodArrayList = new ArrayList<>();


                for (ParameterNode parameterNode : classNode.getFieldDeclarationArraylist()) {
                    fieldArrayList.add(new Field(parameterNode.getId(), parameterNode.getType()));
                }


                for (MethodNode methodNode : classNode.getMethodDeclarationArraylist()) {
                    ArrayList<IType> parameterTypeArrayList = new ArrayList<>();
                    for (ParameterNode parameterNode : methodNode.getParameterNodeArrayList()) {
                        parameterTypeArrayList.add(parameterNode.getType());
                    }
                    methodArrayList.add(new Method(methodNode.getID(), new FunType(parameterTypeArrayList, methodNode.getReturnType())));
                }

                //controllo se la classe è già stata definita
                ClassType classType = new ClassType(classNode.getIdClass(), new ClassType(classNode.getIdSuperClass()), fieldArrayList, methodArrayList);
                env.processDeclaration(classNode.getIdClass(), classType, 0);
            } catch (MultipleIDException e) {
                res.add("La classe '" + classNode.getIdClass() + "' è dichiarata più volte\n");
            }
        }

        //checkSemantic su ogni classe dichiarata
        for (ClassNode classNode : classDeclarationsArrayList) {
            res.addAll(classNode.checkSemantics(env));
        }

        //checksemantic sul letInNode
        res.addAll(letInNode.checkSemantics(env));

        //esco dal livello di scope
        env.popHashMap();

        return res;
    }

    @Override
    public IType typeCheck() throws TypeException {
        System.out.print("ClassDecNode: typeCheck ->\t");
        for (ClassNode classNode : classDeclarationsArrayList) {
            classNode.typeCheck();
        }

        return letInNode.typeCheck();
    }

    @Override
    public String codeGeneration() {

        //TODO Codegen
        /*ArrayList<ClassNode> classNodeArrayList = new ArrayList<>();
        HashMap<String, ClassNode> classHashMap = new HashMap<>();
        String nameDeclaration = "";

        //questi due loop sono usati per ordinare la dichiarazioni di classi in ordine top-down
        //per gestire superclassi e sottoclassi
        ListIterator iterator = classDeclarationsArrayList.listIterator();
        while (iterator.hasNext()) {
            ClassNode classDec = (ClassNode) iterator.next();
            //se la classe che sto esaminando non ha una superclasse allora:
            if (classDec.getIdSuperClass() == null || classDec.getIdSuperClass().isEmpty()) {
                //aggiungo alla lista di classi la dichiarazione della classe
                classNodeArrayList.add(classDec);
                //aggiungo alla hashmap l'identificatore della classe e la dichiarazione della classe
                //serve nel ciclo successivo per ottenere la superclasse
                classHashMap.put(classDec.getIdClass(), classDec);
                //per scorrere
                iterator.remove();
            }
        }
        //se entro dentro a questo while, vuole dire che è presente almeno una classe che ne estende un'altra
        while (classDeclarationsArrayList.size() != 0) {
            //per ripartire dall'inizio
            iterator = classDeclarationsArrayList.listIterator();
            while (iterator.hasNext()) {
                //contiene la classe sottoclasse
                ClassNode subClass = (ClassNode) iterator.next();
                //contiene l'identificatore della superclasse
                String superClassName = subClass.getIdSuperClass();
                //contiene la superclasse
                ClassNode superClass = classHashMap.get(superClassName);
                //nel caso si estenda una classe ancora non dichiarata si entra in questo if
                if (superClass != null) {
                    //aggiungo alle classi dichiarati la sottoclasse
                    classNodeArrayList.add(subClass);
                    //aggiungo alla hashmap l'identificatore della sottoclasse e la sua dichiarazione
                    classHashMap.put(subClass.getIdClass(), subClass);
                    iterator.remove();
                }

            }
        }

        //per ogni classe dichiarata, eseguo la code generation
        for (ClassNode cl : classNodeArrayList) {
            nameDeclaration = nameDeclaration + cl.codeGeneration();
        }

        return nameDeclaration + letInNode.codeGeneration();
    */
        return "";
    }
}
