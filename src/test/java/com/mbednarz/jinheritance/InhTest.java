package com.mbednarz.jinheritance;

import org.testng.annotations.Test;

public class InhTest {

    @Test
    public void inheritanceTest()
    {
        Child ch = new Child();
        //ch.showEyesColor();
        //ch.showHairColor();
        //ch.showSkinType();
        ch.tryToSwim();

        /*
        if (ch.weightGainTendency)
            System.out.println("Kid has tendency to weight gaining (inherited from parents)!");
        else
            System.out.println("No weight gaining tendency!");

         */
    }
}
