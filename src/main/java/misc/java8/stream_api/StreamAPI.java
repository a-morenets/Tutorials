package misc.java8.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream API
 * http://metanit.com/java/tutorial/10.1.php
 * Created by a-morenets on 24.11.2016.
 */
public class StreamAPI {
    static int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

    /**
     * Count of numbers > 0 (NO streamAPI used)
     *
     * @param arr
     * @return
     */
    private static int countOld(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a > 0)
                count++;
        }
        return count;
    }

    /**
     * Count of numbers > 0
     *
     * @param arr
     * @return
     */
    private static long count(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).count();
    }

    /**
     * Count of numbers > 0 (condition as parameter)
     *
     * @param arr
     * @param condition
     * @return
     */
    private static long count(int[] arr, IntPredicate condition) {
        return Arrays.stream(arr).filter(condition).count();
    }

    /**
     * Demo
     *
     * @param args
     */
    public static void main(String[] args) {
        // count even numbers (no streamAPI)
        System.out.println(countOld(numbers)); // 5

        /* filter() */
        // count even numbers with streamAPI
        System.out.println(count(numbers));    // 5
        // count even numbers
        IntPredicate condition = x -> x % 2 != 0;
        System.out.println(count(numbers, condition)); // 6
        // display each odd number multiplied by 10
        Arrays.stream(numbers).filter(x -> x % 2 != 0).forEach(x -> System.out.println(x *= 10));

        /* allMatch() */
        System.out.println(Arrays.stream(numbers).allMatch(x -> x > -10 && x < 10)); // true

        /* anyMatch() */
        System.out.println(Arrays.stream(numbers).anyMatch(x -> x == 6)); // false


        /* map() */
        // convert types: Phone to String
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", "Apple", 600),
                new Phone("Lumia 950", "Microsoft", 500),
                new Phone("iPhone 5 S", "Apple", 450),
                new Phone("Lumia 640", "Microsoft", 200));

/*
        phoneStream
                .map(p -> p.getName()) // помещаем в поток только названия телефонов
                .forEach(s -> System.out.println(s));
*/

/*
        phoneStream
                .map(p -> "name: " + p.getName() + ", price: " + p.getPrice())
                .forEach(s -> System.out.println(s));
*/

        /* skip(), limit() */
/*
        phoneStream.skip(1)
                .limit(2)
                .map(p -> "name: " + p.getName() + ", price: " + p.getPrice())
                .forEach(s->System.out.println(s));
*/

        /* reduce() */
/*
        int sum = phoneStream.reduce(0,
                (x, y) -> {
                    if (y.getPrice() < 50000) {
                        return x + y.getPrice();
                    } else {
                        return x;
                    }
                },
                (x, y) -> x + y);

        System.out.println(sum); // 117000
*/

        /* collect() */
        // v1
        List<String> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                "iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                "Lenovo S 850"));
        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toList());
        System.out.println(filteredPhones);
        // create concrete List type - ArrayList
        ArrayList<String> result = phones.stream().collect(Collectors.toCollection(ArrayList::new));
        // Map
/*
        Map<String, Integer> phonesMap = phoneStream
                .collect(Collectors.toMap(Phone::getName, Phone::getPrice));

        phonesMap.forEach((k, v) -> System.out.println(k + " " + v));
*/

        // v2
        ArrayList<String> filteredPhones1 = phones.stream()
                .filter(s -> s.length() < 12)
                .collect(
                        ArrayList::new, // создаем ArrayList
                        ArrayList::add, // добавляем в список элемент
                        ArrayList::addAll); // добавляем в список другой список

        filteredPhones1.forEach(System.out::println);

        // collect() + groupingBy()
        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany));

        for (Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey());
            for (Phone phone : item.getValue()) {
                System.out.println(phone.getName());
            }
            System.out.println();
        }
    }
}
