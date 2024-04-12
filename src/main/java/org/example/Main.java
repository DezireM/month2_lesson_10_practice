package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle",12);
        Triangle triangle = new Triangle("Triangle",2,34,4);
        Square square = new Square ("Square",34);
        Rectangle rectangle = new Rectangle("Rectangle",4,5);
        Figure[] figures = {circle,square,triangle};

        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Mimi");

        Drawable[] drawables = {circle, square, triangle, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] instanceof Figure){
                System.out.println(((Figure)drawables[i]).getName() + " Perimeter -> " +
                        ((Figure)drawables[i]).calculatePerimeter());
            }
            if(drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }

    }
}