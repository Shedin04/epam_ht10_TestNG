package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task10;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task10Test {

    @Test(description = "Return sorted sequence of characters in descending order by initial string length")
    public void test1() {
        List<Character> actual = Task10.getSortedLastLettersInUpperCase(Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"));
        List<Character> expected = Arrays.asList('U', 'D', 'B', 'B', 'F', 'P', 'S', 'A');
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}