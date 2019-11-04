package com.mbednarz.jinheritance;

public class Child extends Parent
{
    protected String eyesColor = "Green";

    public void showEyesColor()
    {
        System.out.println("Kid's eyes color: " + eyesColor);
    }

    public void showHairColor()
    {
        System.out.println("Kid's hair color: " + hairColor);
    }

     public void showSkinType()
     {
         System.out.println("Kid's skin type: " + skinType);
     }

     public void showWeightGainTendency()
     {
         System.out.println("If kid has a tendency for weight gaining? ANSWER = " + weightGainTendency);
     }

     @Override
     public void tryToSwim()
     {
         System.out.println("CH: It's very probable that kid has a talent to swimming inherited from the parents...");
     }
}
