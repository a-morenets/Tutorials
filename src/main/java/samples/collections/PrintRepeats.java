package samples.collections;

import java.util.*;

/**
 * Print repeats array elements
 */
public class PrintRepeats {

    public static void main(String[] args) {
        int arrayFirst[] = {1, 5, 3, 9, 12, 17, 3};
        int secondArray[] = {2, 3, 5, 15, 12, 19, 17, 3};

        Collection<Integer> result = new ArrayList<>();//new TreeSet<>();
        findRepeatsOne(arrayFirst, secondArray, result);
        System.out.println(result);
        result.clear();
        findRepeatsSecond(arrayFirst, secondArray, result);
        System.out.println(result);
        result.clear();
        printRepeatsThird(arrayFirst, secondArray, result);
        System.out.println(result);

        result.clear();
        printRepeatsFourth(arrayFirst, secondArray, result);
        System.out.println(result);
        // Map<Integer,Set<Integer>>

    }

    public static void printRepeatsFourth(int[] arrayFirst, int[] secondArray, Collection<Integer> result) {
        Set<Integer> secondSet = new HashSet<>();

        for (int j : secondArray) {
            secondSet.add(j);
        }
        for (int i : arrayFirst) {
            if (secondSet.contains(i)) {
                result.add(i);
            }
        }
    }

    public static void printRepeatsThird(int[] arrayFirst, int[] secondArray, Collection<Integer> result) {
        int hash[] = new int[20];
        for (int j = 0; j < secondArray.length; j++) {
            hash[secondArray[j]]++;
        }

        for (int i = 0; i < arrayFirst.length; i++) {
            if (hash[arrayFirst[i]] != 0) {
                result.add(arrayFirst[i]);
            }
        }
    }

    public static void findRepeatsSecond(int[] arrayFirst,
                                         int[] secondArray,
                                         Collection<Integer> result) {

        Objects.requireNonNull(arrayFirst, "arrayFirst can't be null");
        Objects.requireNonNull(secondArray, "secondArray can't be null");
        Objects.requireNonNull(result, "result can't be null");
        checkEmpty(result);

        Arrays.sort(arrayFirst);
        Arrays.sort(secondArray);

        int firstIndex = 0;
        int secondIndex = 0;


        while (firstIndex < arrayFirst.length
                && secondIndex < secondArray.length) {
            if (arrayFirst[firstIndex] == secondArray[secondIndex]) {
                int val = arrayFirst[firstIndex];
                result.add(val);
                firstIndex++;
                secondIndex++;
                while (firstIndex < arrayFirst.length
                        && val == arrayFirst[firstIndex]) {
                    firstIndex++;
                }
                ;
            } else if (arrayFirst[firstIndex] < secondArray[secondIndex]) {
                firstIndex++;
            } else { //arrayFirst[firstIndex] > secondArray[secondIndex]
                secondIndex++;
            }
        }
    }

    private static void checkEmpty(Collection<Integer> result) {
        if (!result.isEmpty()) {
            throw new IllegalArgumentException("result is not empty");
        }
    }

    private static void findRepeatsOne(int[] arrayFirst, int[] secondArray, Collection<Integer> result) {
        Objects.requireNonNull(arrayFirst, "arrayFirst can't be null");
        Objects.requireNonNull(secondArray, "secondArray can't be null");
        Objects.requireNonNull(result, "result can't be null");
        checkEmpty(result);

        outer:
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int k = 0; k < i; k++) {
                if (arrayFirst[k] == arrayFirst[i])
                    continue outer;
            }
            for (int j = 0; j < secondArray.length; j++) {
                if (arrayFirst[i] == secondArray[j]) {
                    result.add(arrayFirst[i]);
                    break;
                }
            }
        }
    }
}
