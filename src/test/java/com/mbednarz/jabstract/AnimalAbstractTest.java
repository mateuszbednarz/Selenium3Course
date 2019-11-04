package com.mbednarz.jabstract;

import org.testng.annotations.Test;

public class AnimalAbstractTest
{
    @Test
    public void absClassTest()
    {
        Dog d = new Dog();
        System.out.println("D: species name = " + d.species);
        d.move();
        d.eat();
        d.drink();
        System.out.println("===============================");
        Bird b = new Bird();
        b.species = "birds";
        System.out.println("B: species name = " + b.species);
        b.move();
        b.eat();
        b.drink();

    }
}
