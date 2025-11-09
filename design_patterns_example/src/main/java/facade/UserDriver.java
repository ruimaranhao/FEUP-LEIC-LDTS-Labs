package facade;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class UserDriver {
    public static void main(String[] args) {
        DirectionsFacade dirFacade = new DirectionsFacade();
        System.out.println(dirFacade.getAllDirections());


    }
}
