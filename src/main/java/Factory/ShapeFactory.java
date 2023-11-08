package Factory;

import Model.Circle;
import Model.Triangle;
import Model.Shape;
import Model.Square;

public class ShapeFactory implements IFactory{
    @Override
    public Shape createShape(String name) {
        return switch (name) {
            case "Круг" -> new Circle();
            case "Квадрат" -> new Square();
            case "Треугольник" -> new Triangle();
            default -> null;
        };
    }
}