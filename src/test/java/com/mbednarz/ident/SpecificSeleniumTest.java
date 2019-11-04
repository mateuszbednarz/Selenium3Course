package com.mbednarz.ident;

public class SpecificSeleniumTest extends BaseSeleniumClass {

    public void checkAccessFromSubclass()
    {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth); /* zmienna dostępna jest tylko w obrębie klasy w której została zdefiniowana, więc nie mogę jej tutaj użyć! */
    }
}
