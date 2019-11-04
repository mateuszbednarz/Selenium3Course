package com.mbednarz.jinterface;

public class LexusCar implements Auto {

    // specyficzna metoda dla aut marki Lexus
    public void luxurySeatsModeOn()
    {
        System.out.println("Turn on the massage & air condition for all seats!");
    }

    @Override
    public void drive() {
        System.out.println("Start engine of your limousine and just drive!");
    }

    @Override
    public void stop() {
        System.out.println("Stop you limousine now!");
    }

    @Override
    public void openWindow() {
        System.out.println("Open all electric windows!");
    }

    @Override
    public void changeGear() {
        System.out.println("Set-up the gearbox in to 'oceanic ship' mode!");
    }
}
