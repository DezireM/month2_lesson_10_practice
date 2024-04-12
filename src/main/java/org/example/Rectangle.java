package org.example;

public class Rectangle extends Figure implements Drawable{
    private int  sideA,sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculatePerimeter() {
        return 2*(sideB + sideA);
    }

    @Override
    public void draw() {
        System.out.println("▬");

    }
}
