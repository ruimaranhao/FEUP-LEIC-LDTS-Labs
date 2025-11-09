package factory;

/**
 * Created by jahnaariellegoldman on 7/28/16.
 */
public class Triangle implements Shape {
    private final static int numberSides = 3;
    private final static String shapeName = "triangle";

    public Triangle() {
    }

    @Override
    public int getNumberSides() {
        return numberSides;
    }

    @Override
    public String getName() {
        return shapeName;
    }

    @Override
    public void draw() {
        System.out.println(" /\\ ");
        System.out.println("/  \\");
        System.out.println("----");
    }
}

