package block02;

import java.util.Arrays;


public class BubbleSorter {

	public static void sort(int[] data) {
		for (int barrier = data.length - 1; barrier >= 0; barrier--) {
			for (int index = 0; index < barrier; index++) {
				if (data[index] > data[index + 1]) {
					int tmp = data[index];
					data[index] = data[index + 1];
					data[index + 1] = tmp;
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
			BubbleSorter.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}

}