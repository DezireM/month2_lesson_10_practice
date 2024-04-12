package org.example;

public class Square extends Figure implements Drawable{
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }
    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("⬛ ");
    }
}
