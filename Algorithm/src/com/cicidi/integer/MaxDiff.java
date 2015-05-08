package com.cicidi.integer;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 3, 5, 8, 3, 1, 3 };

		int max = 0, dif = 0, start = 0, end = 0;
		if (array.length > 2) {
			start = array[0];
			end = array[1];
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] > array[i]) {
				end = array[i + 1];
				dif = end - start;
				if (dif > max) {
					max = dif;
				}
			} else
				start = array[i + 1];
			continue;
		}
		System.out.print(max);
	}
}
