package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task8;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task8Test {

    @Test(description = "Compute a union of two subsets of integers")
    public void test1() {
        List<Integer> actual = Task8.getSortedUnionTwoSubsetsIntegers(3, 4, Arrays.asList(new Integer[]{-10, 3, -3, 4, 55, 6}));
        List<Integer> expected = Arrays.asList(new Integer[]{55, 6, 4});
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}