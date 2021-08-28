package com.epam.test.automation.java.practice14.middle;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task10 {
    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {

        List<Character> result = stringList.stream()
                .map(str -> str.toUpperCase(Locale.ROOT))
                .sorted(((o1, o2) -> o2.charAt(0) - o1.charAt(0)))
                .map(s -> (s.charAt(1) + "").toUpperCase())
                .map(s -> s.charAt(0))
                .collect(Collectors.toList());

        System.out.println(result.toString());
        return null;
    }
}

/*A sequence of non-empty strings of Latin alphabet characters stringList is given.
Select the last character from each string, converting it to uppercase.
Return sorted sequence of characters in descending order by initial string length.
For example:
input: {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"}
output: {'U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'}*/

/*Дана последовательность непустых строк символов латинского алфавита stringList.
Выберите последний символ из каждой строки, переводя его в верхний регистр. Возвращает отсортированную последовательность символов в порядке убывания по начальной длине строки.
Например:
ввод: {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"}
вывод: {'U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'}*/