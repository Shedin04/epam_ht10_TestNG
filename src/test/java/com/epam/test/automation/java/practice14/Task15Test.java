package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task15.CountryStat;
import com.epam.test.automation.java.practice14.advanced.task15.Good;
import com.epam.test.automation.java.practice14.advanced.task15.StorePrice;
import com.epam.test.automation.java.practice14.advanced.task15.Task15;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Task15Test {

    @Test(description = "For each country of origin get the number of stores offering goods manufactured in that country, " +
            "as well as the minimum price for goods from this country for all stores")
    public void test1() {
        List<CountryStat> actual = Task15.name(Arrays.asList(
                new Good(1, "milk", "Poland"),
                new Good(2, "milk", "Russia")), Arrays.asList(
                new StorePrice(1, "BigShop", BigDecimal.valueOf(12.50)),
                new StorePrice(1, "SushiBar", BigDecimal.valueOf(10.50)),
                new StorePrice(2, "BigShop", BigDecimal.valueOf(12.50))
                ));
        List<CountryStat> expected = Arrays.asList(
                new CountryStat("Poland", 2, BigDecimal.valueOf(10.50)),
                new CountryStat("Russia", 1, BigDecimal.valueOf(12.50)));
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}