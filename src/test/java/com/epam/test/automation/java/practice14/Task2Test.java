package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task2;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task2Test {

    @Test(description = "A sequence of ascending sorted integer values equal to the lengths of the strings included in the stringList sequence")
    public void test1() {
        List<Integer> actual = Task2.sortAscLengthsOfStrings(Arrays.asList("Hello", "world", "!", "Good", "morning", "!"));
        List<Integer> expected = Arrays.asList(1, 1, 4, 5, 5, 7);
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}