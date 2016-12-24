package block02;

import java.util.Arrays;


public class SelectionSorter {

	public static void sort(int[] arr) {
		for (int barrier = 0; barrier < arr.length - 1; barrier++) {
			for (int index = barrier + 1; index < arr.length; index++) {
				if (arr[barrier] > arr[index]) {
					int tmp = arr[index];
					arr[index] = arr[barrier];
					arr[barrier] = tmp;
				}
			}
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
			SelectionSorter.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}
	
}