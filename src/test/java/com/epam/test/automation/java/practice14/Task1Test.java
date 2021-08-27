package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task1Test {

    @Test(description = "Sequence of strings with more than one character from the stringList, starting and ending with C")
    public void test1() {
        List<String> actual = Task1.filterByFirstAndLastCharacter('a', Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a"));
        List<String> expected = Arrays.asList("asda", "asdfa");
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}