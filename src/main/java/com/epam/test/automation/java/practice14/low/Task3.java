package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream().map(s -> String.valueOf(new char[]{s.charAt(0),s.charAt(s.length()-1)}))
                .collect(Collectors.toList());
    }
}