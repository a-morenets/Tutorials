package block02;

import java.util.Arrays;

public class Bubbling {
	
	public static void main(String[] args) {
		/*
		 * Безусловное "всплытие" элемента
		 * Самый первый элемент стал самым последним.
		 */
		int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
		System.out.println(Arrays.toString(array));
		for (int k = 0; k < array.length - 1; k++) {
			swap(array, k, k + 1);
		}
		System.out.println(Arrays.toString(array));
		
		/*
		 * Условное "всплытие" элемента
		 * При "условном проходе" не только справа оказывается самый большой элемент, но и
		 * в целом массив как-то меняется.
		 */
		array = new int[] {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
		System.out.println(Arrays.toString(array));
		for (int k = 0; k < array.length - 1; k++) {
			swap(array, k, k + 1);
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void swap(int[] array, int fst, int snd) {
		int tmp = array[fst];
		array[fst] = array[snd];
		array[snd] = tmp;
	}
	
}
