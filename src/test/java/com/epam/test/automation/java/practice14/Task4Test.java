package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task4;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task4Test {

    @Test(description = "Get from stringList all strings of length K ending in a digit and sort them in ascending order")
    public void test1() {
        List<String> actual = Task4.filterAndSortByLastDigit(2, Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"));
        List<String> expected = Arrays.asList("A1", "S3");
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}