package misc.java8.method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * Method references
 * http://metanit.com/java/tutorial/9.2.php
 * Created by a-morenets on 24.11.2016.
 */
public class MethodReferences {

    /* This method can be used as method reference */
    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    /* This method can be used as method reference */
    private static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Sum of numbers with condition
     * @param numbers array of numbers
     * @param func    condition
     * @return sum of numbers with condition
     */
    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }

    /**
     * Demo
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // sum even numbers only
        Expression func = n -> n % 2 == 0; // lambda expression
        System.out.println(sum(nums, func)); // 20

        // sum even numbers only
        func = new MethodReferences()::isEven; // non-static method reference
        System.out.println(sum(nums, func)); // 20

        // sum positive numbers only
        System.out.println(sum(nums, MethodReferences::isPositive)); // 45 // static method reference

        // Constructor references
        UserBuilder0 userBuilder0 = User::new; // default constructor
        User user0 = userBuilder0.createUser();
        System.out.println(user0);
        UserBuilder1 userBuilder1 = User::new; // constructor with 1 parameter
        User user1 = userBuilder1.createUser("Alex");
        System.out.println(user1);
        UserBuilder2 userBuilder2 = User::new; // constructor with 2 parameters
        User user2 = userBuilder2.createUser("Alex_21", 21);
        System.out.println(user2);

        // https://www.tutorialspoint.com/java8/java8_method_references.htm
        List names = new ArrayList();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");
        names.forEach(System.out::println);
    }

}