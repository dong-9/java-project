package staticvariable;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton == null) singleton = new Singleton();
        return singleton;
    }
}
