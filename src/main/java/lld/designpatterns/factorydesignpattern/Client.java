package lld.designpatterns.factorydesignpattern;

import lld.designpatterns.factorydesignpattern.factory.Shape;

/*
This pattern is useful when we've to create object on a conditional basis.
* */

public class Client {
    public static void main(String[] args){
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
