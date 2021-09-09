package com.epam.test.automation.java.practice14.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    private Task6(){}

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList){
        return numbers.stream().map(num -> stringList.stream()
                .filter(str -> Character.isDigit(str.charAt(0)))
                .filter(str -> str.length() == num)
                .findAny()
                .orElse("Not Found"))
                .collect(Collectors.toList());
    }
}