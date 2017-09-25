package misc.java8.method_references;

import java.util.function.Predicate;

/**
 * Method references
 * http://metanit.com/java/tutorial/9.2.php
 * Created by a-morenets on 24.11.2016.
 */
public class MethodReferences {

    /* This non-static method can be used as method reference in Predicate */
    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    /* This static method can be used as method reference in Predicate */
    private static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Sum of numbers with condition
     *
     * @param numbers array of numbers
     * @param func    condition
     * @return sum of numbers with condition
     */
    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.test(i))
                result += i;
        }
        return result;
    }

    /* This non-static method can be used in a static way as method reference in Predicate */
    private boolean isOdd(int n) {
        return n % 2 == 0;
    }

    private int sumOdd(int[] numbers, Expr func) {
        int result = 0;
        for (int i : numbers) {
            if (func.test(null, i))
                result += i;
        }
        return result;
    }

    void printOddSum(int[] nums) {
        // non-static method reference in a static way (sum odd numbers only)
        System.out.println(sumOdd(nums, MethodReferences::isOdd)); // 45
    }

    /**
     * Demo
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // use lambda expression (sum even numbers only)
        Expression func = n -> n % 2 == 0;
        System.out.println(sum(nums, func)); // 20

        MethodReferences mr = new MethodReferences();

        // use non-static method reference (sum even numbers only)
        func = mr::isEven;
        System.out.println(sum(nums, func)); // 20

        // static method reference (sum positive numbers only)
        System.out.println(sum(nums, MethodReferences::isPositive)); // 45
    }

}