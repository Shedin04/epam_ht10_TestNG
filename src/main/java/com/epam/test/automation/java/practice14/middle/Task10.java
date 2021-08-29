package com.epam.test.automation.java.practice14.middle;

import java.util.*;
import java.util.stream.Collectors;

public class Task10 {
    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {

        return stringList.stream()
                .map(str -> str.toUpperCase(Locale.ROOT))
                .map(str -> str.length() + "" + str.charAt(str.length()-1))
                .sorted(Comparator.reverseOrder())
                .map(str -> str.charAt(1))
                .collect(Collectors.toList());
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