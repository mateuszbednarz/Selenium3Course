package com.mbednarz.jabstract;

public class Dog extends Animal
{
    @Override
    public void move()
    {
        System.out.println("Run fast my animal!");
    }

    @Override
    public void eat()
    {
        System.out.println("Eat your favourite food my animal!");
    }
}
