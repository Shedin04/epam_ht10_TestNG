package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {

        return Stream.concat(integerList.stream().filter(v -> v % 2 == 0).collect(Collectors.toList()).stream(),
                integerList.stream().skip(number).collect(Collectors.toList()).stream()).
                filter(e -> !integerList.stream().filter(v -> v % 2 == 0).collect(Collectors.toList()).contains(e)
                        || !integerList.stream().skip(number).collect(Collectors.toList()).contains(e)).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}