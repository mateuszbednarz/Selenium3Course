package com.mbednarz.collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollList {

    List<String> names = new ArrayList<String> ();
    List<Integer> numbers = new LinkedList<Integer>();


    public void addNames()
    {
        names.add("Matthew Wayder");
        names.add("Timothy Dalton");
        names.add("Robert Downey Jr");
        names.add("Rambo");
        names.add("Predator");
    }

    public void setLottoNumbers()
    {
        numbers.add(2);
        numbers.add(41);
        numbers.add(67);
        numbers.add(81);
        numbers.add(90);
        numbers.add(34);
    }

    @Test
    public void listTest()
    {
        addNames();
        System.out.println("First person: " + names.get(0));
        System.out.println("Names list size: " + names.size() + " persons");
        names.remove("Rambo");
        System.out.println("Names list size after 'Rambo' removal: " + names.size());
        System.out.println("Predator index: " + names.indexOf("Predator"));
        System.out.println("Is list contains a name 'Predator': " + names.contains("Predator"));
    }

    @Test
    public void linkedListTest()
    {
        setLottoNumbers();
        System.out.println("Index '0' value: " + numbers.get(0));
        System.out.println("If number list contains number '2'? Answer: " + numbers.contains(2));
        System.out.println("All numbers count is: " + numbers.size());
        System.out.println("Remove numbers assigned to index '2': " + numbers.remove(2));
        System.out.println("List size after index '2' removing: " + numbers.size());
    }
}
