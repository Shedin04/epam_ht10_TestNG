package com.epam.test.automation.java.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.List;

public class Task11 {
    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        //TODO: Write your own solution in the return statement;
        return null;
    }
}

/*A sequence of data about applicants nameList of type Entrant is given. Each element of the
sequence includes the fields <school_number> <year_of_entering> <last_name>
Get data (list of YearSchoolStat values) about the number of different schools that applicants
graduated from for each year present in the source data. The YearSchoolStat type includes the
<year_of_entering> <number_of_schools> fields. The list of YearSchoolStat values must be
sorted in ascending order of the number of schools, and for matching values, in ascending order
of the year number.
Look at the template on the end of the task before solving the problem.

Дана последовательность данных о претендентах nameList типа Entrant. Каждый элемент
последовательность включает поля <school_number> <year_of_entering> <last_name>
Получить данные (список значений YearSchoolStat) о количестве разных школ, в которые поступают
за каждый год, указанный в исходных данных. Тип YearSchoolStat включает
Поля <год_ввода> <количество_школ>. Список значений YearSchoolStat должен быть
отсортировано в порядке возрастания количества школ, а для совпадающих значений - в порядке возрастания
номера года.
Посмотрите на шаблон в конце задания, прежде чем решать проблему.

For example:
input: {
(1, 1993, "Ivanov"),
(2, 1992, "Petrov"),
(3, 1993, "Pupkin"),
(3, 2000, "Zobkin"),
(3, 2000, "Zabkin")
}
output: {
YearSchoolStat{yearOfEntering=1992, numberOfSchools=1},
YearSchoolStat{yearOfEntering=2000, numberOfSchools=1},
YearSchoolStat{yearOfEntering=1993, numberOfSchools=2}
}*/