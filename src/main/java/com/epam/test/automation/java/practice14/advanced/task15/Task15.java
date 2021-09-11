package com.epam.test.automation.java.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Task15 {

    private Task15(){}

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {
        List<CountryStat> result = new ArrayList<>();

        Map<String,BigDecimal> temp = new HashMap<>();
        Map<String,Integer> countOfShops = new HashMap<>();

        BigDecimal[] tempPrice = {storePriceList.get(0).getPrice()};
        String[] tempCountry = {goodList.get(0).getCountryOfOrigin()};
        int[] i = {1};

        goodList.forEach(good -> storePriceList.forEach(store -> {
            if (!good.getCountryOfOrigin().equals(tempCountry[0])) {
                i[0]=1;
            }
            if (good.getProductSKU() == store.getProductSKU()){
                if (!tempCountry[0].equals(good.getCountryOfOrigin())) tempPrice[0] = store.getPrice();
                if (tempPrice[0].compareTo(store.getPrice())>= 0) {
                    temp.put(good.getCountryOfOrigin(),store.getPrice());
                    tempPrice[0] = store.getPrice();
                }
                countOfShops.put(good.getCountryOfOrigin(), i[0]++);
                tempCountry[0] = good.getCountryOfOrigin();
            }
        }));

        temp.forEach((key, value) -> result.add(new CountryStat(key, countOfShops.get(key), value)));
        goodList.stream().map(Good::getCountryOfOrigin).collect(Collectors.toList()).stream().filter(country -> !temp.containsKey(country)).forEach(country -> result.add(new CountryStat(country,0,BigDecimal.ZERO)));
        return result.stream().sorted(Comparator.comparing(CountryStat::getCountryOfOrigin)).collect(Collectors.toList());
    }
}

/*A sequence of information about goods goodList of type Good and a sequence of prices of
goods in various stores storePriceList of type StorePrice are given. Each element of the
goodList sequence includes the <product_SKU>, , <country_of_origin> fields.
Each element of the storePriceList sequence includes the <product_SKU>, <store_Title>,
 fields.
For each country of origin get the number of stores offering goods manufactured in that country,
as well as the minimum price for goods from this country for all stores (CountryStat values). If
no product is found for a certain country that is presented in any store, then the number of stores
and the minimum price are assumed to be 0. Sort the list by country of origin.
Look at the template on the end of the task before solving the problem.

Последовательность информации о товарах goodList типа Good и последовательность цен
Приведены товары в различных магазинах storePriceList типа StorePrice. Каждый элемент
Последовательность goodList включает поля <product_SKU>,, <country_of_origin>.
Каждый элемент последовательности storePriceList включает <product_SKU>, <store_Title>,
  поля.
Для каждой страны происхождения получите количество магазинов, предлагающих товары, произведенные в этой стране,
а также минимальная цена на товары из этой страны для всех магазинов (значения CountryStat). Если
не найден товар для определенной страны, который представлен ни в одном магазине, то количество магазинов
и минимальная цена предполагается равной 0. Отсортируйте список по стране происхождения.
Посмотрите на шаблон в конце задания, прежде чем решать проблему.

For example:
input: {
Good(1, "milk", "Poland"),
Good(2, "milk", "Russia")
},
{
StorePrice(1, "BigShop", BigDecimal("12.50")),
StorePrice(1, "SushiBar", BigDecimal("10.50")),
StorePrice(2, "BigShop", BigDecimal("12.50"))
}
output: {
CountryStat("Poland", 2, BigDecimal("10.50)),
CountryStat("Russia", 1, BigDecimal("12.50"))
}*/