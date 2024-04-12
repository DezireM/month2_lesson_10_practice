package org.example;

public abstract class Animal implements Drawable{
   String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
