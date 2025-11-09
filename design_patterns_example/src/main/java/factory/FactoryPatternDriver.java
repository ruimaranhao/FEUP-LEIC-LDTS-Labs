package factory;

import java.util.ArrayList;

/**
 * Created by jahnaariellegoldman on 7/28/16.
 */
public class FactoryPatternDriver {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        ArrayList<Shape> shapes = new ArrayList();
        Shape shape1 = shapeFactory.getShape("square");
        Shape shape2 = shapeFactory.getShape("triangle");
        Shape shape3 = shapeFactory.getShape("octagon");
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        for (Shape shape : shapes) {
            System.out.println("A " + shape.getName() + " has " + shape.getNumberSides() + " sides");
            shape.draw();
        }




    }
}
