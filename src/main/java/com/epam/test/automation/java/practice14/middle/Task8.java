package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {

        return Stream.concat(intList.stream().filter(i -> i > d).collect(Collectors.toList()).stream(),
                intList.stream().skip(k).collect(Collectors.toList()).stream()).distinct()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}