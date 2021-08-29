package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import com.epam.test.automation.java.practice14.advanced.task13.Task13;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task13Test {

    @Test(description = "Get data about the number of different schools that applicants " +
            "graduated from, for each year from the yearList")
    public void test1() {
        List<YearSchoolStat> actual = Task13.getYearSchoolStatList(Arrays.asList(
                new Entrant(11, 2003, "Ivanov"),
                new Entrant(11, 2001, "Petrov"),
                new Entrant(11, 2001, "Pupkin"),
                new Entrant(10, 1999, "Zobkin"),
                new Entrant(10, 1999, "Zabkin"),
                new Entrant(10, 1999, "Ivanov"),
                new Entrant(10, 2000, "Petrov"),
                new Entrant(14, 2001, "Pupkin"),
                new Entrant(15, 2000, "Zobkin"),
                new Entrant(10, 2000, "Ivanov"),
                new Entrant(12, 2003, "Petrov"),
                new Entrant(11, 2003, "Pupkin"),
                new Entrant(10, 2003, "Zobkin")),
                Arrays.asList(new Integer[]{2001, 1999, 2000, 2002, 2003}));
        List<YearSchoolStat> expected = Arrays.asList(
                new YearSchoolStat(2002, 0),
                new YearSchoolStat(1999,1),
                new YearSchoolStat(2000,2),
                new YearSchoolStat(2001, 2),
                new YearSchoolStat(2003,3));
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}