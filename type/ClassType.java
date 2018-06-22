package type;

import exceptions.UndeclaredIDException;
import util.Semantic.Field;
import util.Semantic.Method;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassType implements IType {

    private String classID;
    private ClassType superClassType = null;

    private ArrayList<Field> fields = new ArrayList<>();
    private ArrayList<Method> methods = new ArrayList<>();

    public ClassType(String classID, ClassType superClass, ArrayList<Field> fields, ArrayList<Method> methods) {
        this.classID = classID;
        this.superClassType = superClass;
        this.fields = fields;
        this.methods = methods;
    }

    public ClassType(String classID) {
        this.classID = classID;
    }

    public String getClassID() {
        return classID;
    }

    public ClassType getSuperClassType() {
        return superClassType;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }


    @Override
    public IDType getID() {
        return IDType.CLASS;
    }

    @Override
    public boolean isSubType(IType t) {

        //TODO isSubType
        return false;
    }

    @Override
    public String toPrint() {
        return null;
    }

    //TODO getOffsetOfMethod, methodsHashMapFromSuperClass, getTypeOfMethod
    //funzioni ausiliarie utilizzate nella checksemantics
    //ritorna un'HashMap di tutti i metodi di questa classe, con nome ed offset
    public HashMap<String, FunType> getMethodsMap() {
        HashMap<String, FunType> methodsMap = new HashMap<>();
        if (superClassType != null) {
            HashMap<String, FunType> superMethodsMap = superClassType.getMethodsMap();
            for (String m : superMethodsMap.keySet())
                methodsMap.put(m, superMethodsMap.get(m));
        }
        for (Method m : methods) {
            methodsMap.put(m.getMethodID(), m.getMethodType());
        }
        return methodsMap;
    }

    //ritorna l'offset del metodo situato nella dispatchTable
    public int getOffsetOfMethod(String methodID) throws UndeclaredIDException {
        HashMap<String, Integer> methodsHashMap = methodsHashMapFromSuperClass();
        Integer offset = methodsHashMap.get(methodID);
        if (offset != null) {
            //ad offset 0 c'è la dispatch table, quindi vengono tutti aumentati di 1
            return offset + 1;
        } else {
            throw new UndeclaredIDException(methodID);
        }
    }

    //ritorna un'HashMap dei metodi della superclasse, con nome ed offset
    public HashMap<String, Integer> methodsHashMapFromSuperClass() {
        if (superClassType == null) {
            HashMap<String, Integer> methodsHashMap = new HashMap<>();
            for (Method method : methods) {
                methodsHashMap.put(method.getMethodID(), methodsHashMap.size());
            }
            return methodsHashMap;
        } else {
            HashMap<String, Integer> superMethodsMap = superClassType.methodsHashMapFromSuperClass();
            for (Method method : methods) {
                if (!superMethodsMap.containsKey(method.getMethodID())) {
                    superMethodsMap.put(method.getMethodID(), superMethodsMap.size());
                }
            }
            return superMethodsMap;
        }
    }

    //ritorna il tipo di un metodo dato l'ID
    public IType getTypeOfMethod(String id) {
        Method method = this.methods
                .stream()
                .filter(m -> m.getMethodID().equals(id))
                .reduce(null, (prev, curr) -> curr);

        if (method != null) {
            return method.getMethodType();
        } else {
            return superClassType.getTypeOfMethod(id);
        }
    }
}


