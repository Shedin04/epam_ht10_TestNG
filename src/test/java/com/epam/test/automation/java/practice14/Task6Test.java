package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task6;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task6Test {

    @Test(description = "For each value n from sequence numbers, " +
            "select a string from sequence stringList that starts with a digit and has length n")
    public void test1() {
        List<String> actual = Task6.shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(Arrays
                .asList(new Integer[]{1, 3, 4}),Arrays.asList("1aa", "aaa", "1", "a"));
        List<String> expected = Arrays.asList("1", "1aa", "Not Found");
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}