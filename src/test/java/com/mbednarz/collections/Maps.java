package com.mbednarz.collections;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    Map<Integer, String> schoolDiary = new HashMap<Integer, String>();

    public void addLearners()
    {
        schoolDiary.put(1, "Mateusz Bednarz");
        schoolDiary.put(2, "Sławek Nowak");
        schoolDiary.put(3, "Damian Cygan");
        schoolDiary.put(4, "Stanisław Satyra");
    }

    @Test
    public void mapTest()
    {
        addLearners();
        System.out.println("Learners count = " + schoolDiary.size());
        schoolDiary.remove(1);
        System.out.println("Learners count after 'Mateusz Bednarz' removal = " + schoolDiary.size());
        System.out.println("Name of the learner assigned to no 2: " + schoolDiary.get(2));
        System.out.println("If our Map contains key no '3'? ANSWER = " + schoolDiary.containsKey(3));
    }
}
