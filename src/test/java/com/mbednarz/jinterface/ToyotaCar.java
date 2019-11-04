package com.mbednarz.jinterface;

public class ToyotaCar implements Auto {

    private String carModel = "Camry";
    private String equipmentVersion = "XLE";

    // specjalna metoda będąca cechą tylko tej konkretnej marki aut
    public void enableHybridModule()
    {
        System.out.println("Enable hybrid engine module - this is special feature of Toyota " + carModel + " " + equipmentVersion + " cars!");
    }

    @Override
    public void drive() {
        System.out.println("Start engine, choose 'D' gear and just drive!");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car immediately!");
    }

    @Override
    public void openWindow() {
        System.out.println("Open electric front windows!");
    }

    @Override
    public void changeGear() {
        System.out.println("Change gear to sequential mode!");
    }
}
