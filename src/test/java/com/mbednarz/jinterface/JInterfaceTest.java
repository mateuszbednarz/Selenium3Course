package com.mbednarz.jinterface;

import org.testng.annotations.Test;

public class JInterfaceTest {

    @Test
    public void jIntfTest() {

        LexusCar lc = new LexusCar();
        showPremiumCar(lc);

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        ToyotaCar tc = new ToyotaCar();
        showNormalCar(tc);
        /*
        tc.drive();
        tc.openWindow();
        tc.enableHybridModule();

        System.out.println("--------- change the car for luxury -----------");

        LexusCar lc = new LexusCar();

        lc.drive();
        lc.openWindow();
        lc.luxurySeatsModeOn();
         */
    }

    public void showPremiumCar(LexusCar lexusCar)
    {
        System.out.println("This is LUXURY driving man!");
        lexusCar.drive();
        lexusCar.changeGear();
        lexusCar.luxurySeatsModeOn();
        lexusCar.openWindow();
    }

    public void showNormalCar(ToyotaCar toyotaCar)
    {
        System.out.println("This is NORMAL driving man!");
        toyotaCar.drive();
        toyotaCar.changeGear();
        toyotaCar.enableHybridModule();
        toyotaCar.openWindow();
    }

}
