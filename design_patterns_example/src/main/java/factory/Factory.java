package factory;

/**
 * Created by jahnaariellegoldman on 7/28/16.
 */
public class Factory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("octagon")) {
            return new Octagon();
        }

        return null;
    }
}
