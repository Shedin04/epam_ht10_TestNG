package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task3Test {

    @Test(description = "A sequence of strings, where each string consists of the first and last characters of the " +
            "corresponding string in the stringList sequence")
    public void test1() {
        List<String> actual = Task3.getListExtremeLetters(Arrays.asList("asd", "a", "basdw"));
        List<String> expected = Arrays.asList("ad", "aa", "bw");
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}