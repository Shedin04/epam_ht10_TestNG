package com.epam.test.automation.java.practice14.advanced.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {
        List<NumberPair> result = new ArrayList<>();

        List<String> stringList1 = integerList1.stream().map(Object::toString)
                .collect(Collectors.toList());
        List<String> stringList2 = integerList2.stream().map(Object::toString)
                .collect(Collectors.toList());

            for (int i = 0; i < integerList2.size(); i++) {
                if (stringList1.get(i).charAt(stringList1.get(i).length()-1) == stringList2.get(i).charAt(stringList2.get(i).length()-1))
                    result.add(new NumberPair((Integer.valueOf(stringList1.get(i))),(Integer.valueOf(stringList2.get(i)))));
                }
        return result;
    }
}

/*A sequence of positive integers integerList1 and integerList2 are given. All values in each
sequence are different.
Get a set (list of NumberPair values) of all value pairs that satisfy the following conditions:
the first element of the pair belongs to the sequence integerList1, the second belongs to
integerList2, and both elements end with the same digit. The NumberPair type includes
<value_1> <value_2> fields. The resulting NumberPair list must be sorted in ascending order
by the first field, and if they are equal, by the second.

Дана последовательность положительных целых чисел integerList1 и integerList2. Все значения в каждом
Последовательности разные.
Получите набор (список значений NumberPair) всех пар значений, удовлетворяющих следующим условиям:
первый элемент пары принадлежит последовательности integerList1, второй принадлежит
integerList2, и оба элемента заканчиваются одной и той же цифрой. Тип NumberPair включает
<value_1> <value_2> поля. Полученный список NumberPair необходимо отсортировать в порядке возрастания.
по первому полю и, если они равны, по второму.

For example:
input: {1, 2, 33, 44}, {11, 22, 13}
output: {NumberPair(1, 11), NumberPair(2, 22), NumberPair(3, 33)}*/