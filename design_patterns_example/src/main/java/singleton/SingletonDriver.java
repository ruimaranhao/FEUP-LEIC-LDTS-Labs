package singleton;

/**
 * Created by jahnaariellegoldman on 7/28/16.
 */
public class SingletonDriver {
    public static void main(String[] args) {
       // can't instantiate the object as usual below - constructor has private access
//         Singleton newSingleton = new Singleton();
        Singleton newSingleton = Singleton.getInstance();
        newSingleton.printClass();


    }
}
