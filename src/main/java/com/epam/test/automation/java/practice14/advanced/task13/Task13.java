package com.epam.test.automation.java.practice14.advanced.task13;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.*;
import java.util.stream.Collectors;

public class Task13 {

    private Task13(){}

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {
        Map<Integer,Integer> map = new TreeMap<>();
        List<YearSchoolStat> result = new ArrayList<>();

        yearList.stream().forEach(year -> map.put(year,0));

        nameList.sort(Comparator.comparing(Entrant::getYearOfEntering));
        int count = 0;
        int year = 0;
        List<Integer> schools = new ArrayList();
        for (Entrant name : nameList) {
            if (name.getYearOfEntering() != year) {
                count = 0;
                schools.clear();
            }
            if (map.containsKey(name.getYearOfEntering()) && !(schools.contains(name.getSchoolNumber()))){
                count++;
                schools.add(name.getSchoolNumber());
                year = name.getYearOfEntering();
                map.put(year,count);
                }
            }
        map.forEach((k,v) -> result.add(new YearSchoolStat(k,v)));
        return result.stream().sorted(Comparator.comparingInt(YearSchoolStat::getNumberOfSchools)).collect(Collectors.toList());
    }
}


/*A sequence of data about applicants nameList of type Entrant and a sequence of integers
yearList representing years are given. Each element of the nameList sequence includes the
fields <school_number> <year_of_entering> <last_name>.
Get data (a list of YearSchoolStat values) about the number of different schools that applicants
graduated from, for each year from the yearList. YearSchoolStat includes < year_of_entering>
<number_of_schools> fields. If in the given year of admission there are no applicants from
the listed schools, indicate zero in the field < number_of_schools >. The YearSchoolStat list
must be sorted in ascending order by the number of schools, and for matching values, in
ascending order by the year number.

Последовательность данных о претендентах name Список типа Entrant и последовательность целых чисел
YearList, представляющий годы. Каждый элемент последовательности nameList включает в себя
поля <номер_школы> <год_ поступления> <последнее_имя>.
Получить данные (список значений YearSchoolStat) о количестве разных школ, в которые поступают
закончил, за каждый год из списка. YearSchoolStat включает <year_of_entering>
<количество_школ> полей. Если в данном году приема нет абитуриентов из
школ, перечисленных в списке, укажите ноль в поле <количество_школ>. Список YearSchoolStat
должны быть отсортированы в порядке возрастания по количеству школ, а для соответствия значений - в
по возрастанию номера года.

For example:
input:
{
2001,
1999,
2000,
2002,
2003
}
{
(11, 2003, "Ivanov"),
(11, 2001, "Petrov"),
(11, 2001, "Pupkin"),
(10, 1999, "Zobkin"),
(10, 1999, "Zabkin"),
(10, 1999, "Ivanov"),
(10, 2000, "Petrov"),
(14, 2001, "Pupkin"),
(15, 2000, "Zobkin"),
(10, 2000, "Ivanov"),
(12, 2003, "Petrov"),
(11, 2003, "Pupkin"),
(10, 2003, "Zobkin"),
}
output: {
(2002, 0),
(1999, 1),
(2000, 2)
(2001, 2)
(2003, 3)
}*/