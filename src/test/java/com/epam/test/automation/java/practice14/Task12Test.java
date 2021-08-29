package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task12.NumberPair;
import com.epam.test.automation.java.practice14.advanced.task12.Task12;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task12Test {

    @Test(description = "Get a set of all value pairs that satisfy conditions")
    public void test1() {
        List<NumberPair> actual = Task12.makeNumberPairsFromTwoList(Arrays.asList(new Integer[]{1, 2, 33, 44}),Arrays.asList(new Integer[]{11, 22, 13}));
        List<NumberPair> expected = Arrays.asList(
                new NumberPair(1, 11),
                new NumberPair(2,22),
                new NumberPair(33,13));
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}