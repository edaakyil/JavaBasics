package com.edaakyil.java.concepts;

public class CatDemoApp {
    public static void main(String[] atgs)
    {
        Cat cat = new Cat("B-cat");
        Cat.Bow bow = cat.new Bow("blue");

        Cat.Bow bow2 = new Cat("R-cat").new Bow("red");

        System.out.println(cat);
        System.out.println(bow);
        System.out.println(bow2);

        bow.printColor();
        bow2.printColor();
    }
}
