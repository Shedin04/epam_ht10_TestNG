package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task5;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task5Test {

    @Test(description = "Get sequence of string representations of only odd integerList values and sort in ascending order")
    public void test1() {
        List<String> actual = Task5.getSortedAscOddValues(Arrays.asList(new Integer[]{3, 1, 2, 3, 4, 5, 6}));
        List<String> expected = Arrays.asList("1", "3", "3", "5");
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}