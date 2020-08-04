package core.pgms;

public class SingletonClass {
    private SingletonClass() {
    }

    private static class SingletonClassHolder {
        private static final SingletonClass SINGLE_INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return SingletonClassHolder.SINGLE_INSTANCE;
    }

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
    }
}

/*This is the best approach to create singleton as no need to think of overriding clone methods or readObjects()
public enum SingletonClass {
    SINGLE_INSTANCE;
}*/
