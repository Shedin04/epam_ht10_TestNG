package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {

    private Task8(){}

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        return intList.stream().filter(num -> num>d).collect(Collectors.toCollection(() -> intList.stream().skip(k).collect(Collectors.toList())))
                .stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}