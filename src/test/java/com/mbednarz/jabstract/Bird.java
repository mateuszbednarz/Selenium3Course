package com.mbednarz.jabstract;

public class Bird extends Animal
{
    @Override
    public void move()
    {
        System.out.println("Fly high my bird!");
    }

    @Override
    public void eat()
    {
        System.out.println("Eat some flies my bird!");
    }
}
