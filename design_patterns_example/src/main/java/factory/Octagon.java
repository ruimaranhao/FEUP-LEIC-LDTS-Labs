package factory;

/**
 * Created by jahnaariellegoldman on 7/29/16.
 */
public class Octagon implements Shape {
    private final static int numSides = 8;
    private final static String shapeName = "octagon";
    @Override
    public int getNumberSides() {
        return numSides;
    }

    @Override
    public String getName() {
        return shapeName;
    }

    @Override
    public void draw() {
        System.out.println(" /-\\");
        System.out.println("|   |");
        System.out.println(" \\_/");
    }
}
