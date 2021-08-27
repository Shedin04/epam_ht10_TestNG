package com.epam.test.automation.java.practice14.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {
        List<String> result = new ArrayList<String>();
        numbers.stream().forEach(num -> {
            stringList.stream().filter(str ->
            {
//                System.out.println("num: " + num + " | str: " + str);
                if (Character.isDigit(str.charAt(0)) && num == str.length()) {
                    return true;
                }
                if (Character.isDigit(str.charAt(0)) && num != str.length() && num > str.length()) {
                    result.add("Not Found");
                    return false;
                }
                return false;
            }).collect(Collectors.toCollection(() -> result));
        });
        return result.stream().distinct().collect(Collectors.toList());
    }
}