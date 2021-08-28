package com.epam.test.automation.java.practice14.middle;

import java.util.*;
import java.util.stream.Collectors;

public class Task7 {

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {

        List<Integer> result = new ArrayList<>();

        for(Integer x: (integerList.stream().filter(v -> v % 2 == 0).collect(Collectors.toSet()))){
            if(!((integerList.stream().skip(number)).collect(Collectors.toSet())).contains(x)){
                result.add(x);
            }
        }
        for(Integer x: ((integerList.stream().skip(number)).collect(Collectors.toSet()))){
            if(!(integerList.stream().filter(v -> v % 2 == 0).collect(Collectors.toSet())).contains(x)){
                result.add(x);
            }
        }
        return result.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}