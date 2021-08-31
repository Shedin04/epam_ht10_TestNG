package com.epam.test.automation.java.practice14.advanced.task14;

import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.*;
import java.util.stream.Collectors;

public class Task14 {
    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        Map customerAndStore = new TreeMap();
        int tempdiscount = 0;
        String tempname = null;
        for (int i = 0; i < supplierList.size(); i++) {
            if (supplierDiscountList.get(i).getStoreName() != tempname) tempdiscount = 0;
            tempname = supplierDiscountList.get(i).getStoreName();
            if (supplierDiscountList.get(i).getDiscountPercentage() > tempdiscount) {
                tempdiscount = supplierDiscountList.get(i).getDiscountPercentage();
                customerAndStore.put(supplierDiscountList.get(i).getStoreName(), supplierList.get(i));
            }
        }

        System.out.println(customerAndStore);
        return null;
    }
}

/*A sequence of customer information for a supplierList of type Supplier and a sequence of
discounts for customers in various stores, supplierDiscountList of type SupplierDiscount is
given. Each element of the supplierList sequence includes the fields <customer_ID>,
<year_of_birth>, <street_of_residence>. Each element of the supplierDiscountList sequence
includes the fields <customer_ID>, <store_name>, <discount_percentage>.
Get a list (maxDiscountOwner values) of all stores and for each store find a customer who has
the maximum discount in it. If for a certain store there are several customers with the maximum
discount, then take the data on the consumer with the minimum code. Sort the list by store
names in ascending alphabetical order. Call stream() for both lists.

Последовательность информации о клиенте для списка поставщиков типа Поставщик и последовательность
скидки для покупателей в различных магазинах, supplierDiscountList типа SupplierDiscount составляет
данный. Каждый элемент последовательности supplierList включает поля <customer_ID>,
<год_ рождения>, <улица_резиденции>. Каждый элемент последовательности supplierDiscountList
включает поля <customer_ID>, <store_name>, <discount_percentage>.
Получите список (значения maxDiscountOwner) всех магазинов и для каждого магазина найдите покупателя, у которого есть
максимальная скидка в нем. Если для определенного магазина есть несколько покупателей с максимальным
скидка, то возьмите данные о потребителе с минимальным кодом. Сортировать список по магазину
имена в возрастающем алфавитном порядке. Вызовите stream () для обоих списков.

For example:
input: {
Supplier(1, 1993, "Sumskaya")
Supplier(2, 1994, "Pushkinskaya")
Supplier(3, 1995, "Beketova")
Supplier(4, 1996, "Amosova")
Supplier(5, 1996, "Amosova")
SupplierDiscount(1, 9, "Posad")
SupplierDiscount(2, 9, "Posad")
SupplierDiscount(3, 10, "Colins")
SupplierDiscount(4, 10, "Colins")
SupplierDiscount(5, 10, "Denim")
}
output: {
("Colins", new Supplier(3, 1995, "Beketova"))
("Denim", new Supplier(5, 1996, "Amosova"))
("Posad", new Supplier(1, 1993, "Sumskaya"))
}*/