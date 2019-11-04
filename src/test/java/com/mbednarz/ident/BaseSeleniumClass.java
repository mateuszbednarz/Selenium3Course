package com.mbednarz.ident;

public class BaseSeleniumClass {

    public String first = "PUBLICZNY";
    String second = "BEZ IDENTYFIKATORA";
    protected String third = "PROTECTED (CHRONIONY)";
    private String fourth = "PRYWATNY";

    public void checkAccess()
    {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
        System.out.println("Fourth: " + fourth);
    }
}
