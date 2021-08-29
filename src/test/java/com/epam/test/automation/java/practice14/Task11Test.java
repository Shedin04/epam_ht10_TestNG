package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import com.epam.test.automation.java.practice14.advanced.task11.Task11;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task11Test {

    @Test(description = "Get data about the number of different schools that applicants " +
            "graduated from for each year present in the source data")
    public void test1() {
        List<YearSchoolStat> actual = Task11.getYearSchoolStats(Arrays.asList(
                new Entrant(1, 1993, "Ivanov"),
                new Entrant(2, 1992, "Petrov"),
                new Entrant(3, 1993, "Pupkin"),
                new Entrant(3, 2000, "Zobkin"),
                new Entrant(3, 2000, "Zabkin")));

        List<YearSchoolStat> expected = (Arrays.asList(
                new YearSchoolStat(1992, 1),
                new YearSchoolStat(2000, 1),
                new YearSchoolStat(1993, 2)));
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}