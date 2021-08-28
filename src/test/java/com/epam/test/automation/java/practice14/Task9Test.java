package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task9;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task9Test {

    @Test(description = "Determine their total length")
    public void test1() {
        List<String> actual = Task9.shouldReturnStringListWithLengthAndFirstLetter(Arrays.asList("ABC", "A", "BCD", "D"));
        List<String> expected = Arrays.asList("4-A", "3-B", "1-D");
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}