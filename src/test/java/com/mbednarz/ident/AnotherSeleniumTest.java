package com.mbednarz.ident;

public class AnotherSeleniumTest {

    public void accessCheck()
    {
        BaseSeleniumClass bsc = new BaseSeleniumClass();

        System.out.println(bsc.first);
        System.out.println(bsc.second);
        System.out.println(bsc.third);
        //System.out.println(bsc.fourth); /* zmienna dostępna jest tylko w obrębie klasy w której została zdefiniowana, więc nie mogę jej tutaj użyć! */
    }
}
