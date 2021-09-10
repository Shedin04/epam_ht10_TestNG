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
                new Good(2, "milk", "Russia"),
                new Good(1, "milk", "Ukraine"),
                new Good(3, "milk", "Poland"),
                new Good(4, "milk", "Belarus"),
                new Good(5, "milk", "England")
                ),Arrays.asList(
                new StorePrice(3, "BigShop", BigDecimal.valueOf(15.95)),
                new StorePrice(1, "SushiBar", BigDecimal.valueOf(11)),
                new StorePrice(4, "SushiBar", BigDecimal.valueOf(13)),
                new StorePrice(2, "SushiBar", BigDecimal.valueOf(13.65)),
                new StorePrice(1, "SushiBar", BigDecimal.valueOf(12.50)),
                new StorePrice(4, "SushiBar", BigDecimal.valueOf(15.95)),
                new StorePrice(3, "SushiBar", BigDecimal.valueOf(12)),
                new StorePrice(4, "SushiBar", BigDecimal.valueOf(17.5)),
                new StorePrice(3, "SushiBar", BigDecimal.valueOf(9.75)),
                new StorePrice(2, "SushiBar", BigDecimal.valueOf(29)),
                new StorePrice(1, "SushiBar", BigDecimal.valueOf(10.5)),
                new StorePrice(1, "SushiBar", BigDecimal.valueOf(16.50)),
                new StorePrice(1, "SushiBar", BigDecimal.valueOf(19.25)),
                new StorePrice(3, "SushiBar", BigDecimal.valueOf(23.5)),
                new StorePrice(3, "SushiBar", BigDecimal.valueOf(14.4)),
                new StorePrice(2, "BigShop", BigDecimal.valueOf(14.2))));
        List<CountryStat> expected = Arrays.asList(
                new CountryStat("Belarus", 3, BigDecimal.valueOf(13)),
                new CountryStat("Poland",5,BigDecimal.valueOf(9.75)),
                new CountryStat("Russia",3,BigDecimal.valueOf(13.65)),
                new CountryStat("Ukraine", 5, BigDecimal.valueOf(10.5)));
        Assert.assertEquals(actual.toString(), expected.toString());
    }
}