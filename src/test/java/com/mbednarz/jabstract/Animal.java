package com.mbednarz.jabstract;

public abstract class Animal
{
    public String species = "Mammal";

    public abstract void move();
    public abstract void eat();

    public void drink()
    {
        System.out.println("ALL: Drink water my animal!");
    }
}
