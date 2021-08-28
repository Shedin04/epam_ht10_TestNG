package com.epam.test.automation.java.practice14.middle;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

public class Task9 {

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {

        return stringList.stream().map(string -> new AbstractMap.SimpleEntry<>(string.charAt(0), string.length()))
                .collect(
                        Collectors.collectingAndThen(Collector.of((Supplier<HashMap<Character, Integer>>) HashMap::new,
                                (map, entry) -> {
                                    int prevSize = map.getOrDefault(entry.getKey(), 0);
                                    map.put(entry.getKey(), prevSize + entry.getValue());
                                },
                                (a, b) -> {
                                    throw new UnsupportedOperationException();
                                }),
                                map -> map.entrySet()
                                        .stream()))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(entry -> entry.getValue() + "-" + entry.getKey())
                .collect(Collectors.toList());
    }
}

/*A sequence of non-empty strings stringList is given, containing only uppercase letters of the Latin alphabet.
For all strings starting with the same letter, determine their total length and obtain a sequence of strings of the form "S-C", where S is the total length of all strings from stringList that begin with the character C. Order the resulting sequence in descending order of the numerical values of the sums, and for equal values of the sums, in ascending order of the C character codes.
For example:
input: {"ABC", "A", "BCD", "D"}
output: {"4-A", "3-B", "1-D"}*/


/*Дана последовательность непустых строк stringList, содержащая только прописные буквы латинского алфавита.
Для всех строк, начинающихся с одной и той же буквы, определите их общую длину и получите последовательность строк вида «SC», где S - общая длина всех строк из списка строк, которые начинаются с символа C. Упорядочить результирующую последовательность по убыванию. порядок числовых значений сумм, а для равных значений сумм - в порядке возрастания кодов символов C.
Например:
ввод: {"ABC", "A", "BCD", "D"}
вывод: {"4-A", "3-B", "1-D"}*/