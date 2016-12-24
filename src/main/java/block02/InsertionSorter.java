package block02;

import java.util.Arrays;


public class InsertionSorter {

	public static void sort(int[] arr) {
		for (int k = 1; k < arr.length; k++) {
			int newElement = arr[k];
			int location = k - 1;
			while (location >= 0 && arr[location] > newElement) {
				arr[location + 1] = arr[location];
				location--;
			}
			arr[location + 1] = newElement;
		}
	}

	public static void main(String[] args) {
		int[][] data = {
			{},
			{ 1 },
			{ 0, 3, 2, 1 },
			{ 4, 3, 2, 1, 0 },
			{ 6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7 },
		};

		for (int[] arr : data) {
			System.out.print(Arrays.toString(arr) + " -> ");
			InsertionSorter.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}
	
}