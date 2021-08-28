package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task7;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task7Test {

    @Test(description = " Calculate the symmetrical difference between two subsets of integer values")
    public void test1() {
        List<Integer> actual = Task7.getSortedDifferenceBetweenSubsets(5,Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        List<Integer> expected = Arrays.asList(new Integer[]{9, 7, 4, 2});
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}