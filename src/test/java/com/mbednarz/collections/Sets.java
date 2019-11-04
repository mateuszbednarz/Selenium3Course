package com.mbednarz.collections;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    Set<String> nicks = new HashSet<String>();

    public void addNicks()
    {
        nicks.add("Ponury Żniwiarz");
        nicks.add("Ognisty Lisek 19");
        nicks.add("Mac Gyver");
        nicks.add("Czarna Owca");
        nicks.add("Czarny Rycerz");
    }

    @Test
    public void setOperations()
    {
        addNicks();
        nicks.add("Vandal Chrome");
        System.out.println("Nicks count = " + nicks.size());
        System.out.println("If our HashSet contains a nick 'Mac Gyver'? ANSWER: " + nicks.contains("Mac Gyver"));
        nicks.remove("Czarna Owca");
        System.out.println("Nicks count after 'Czarna Owca' removal = " + nicks.size());
    }
}