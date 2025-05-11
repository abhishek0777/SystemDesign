package lld.designpatterns.factorydesignpattern;

import lld.designpatterns.factorydesignpattern.factory.Circle;
import lld.designpatterns.factorydesignpattern.factory.Rectangle;
import lld.designpatterns.factorydesignpattern.factory.Shape;

public class ShapeFactory {
    public static Shape getShape(String shape){
        switch (shape){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException();
        }

    }
}
