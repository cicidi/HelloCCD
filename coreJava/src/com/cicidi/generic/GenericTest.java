package com.cicidi.generic;

import java.util.Arrays;

public class GenericTest {
	public static void main(String[] arg) {
		Integer[] intArray = { 1, 23, 82, 83, 13, 25 };
		Double[] doubleArray = { 1.0, 23.1, 82.4, 83.7, 13.1, 25.0 };
		testGenericMethod(intArray);
		testGenericMethod(doubleArray);
		GenericTest gt = new GenericTest();
		System.out.println("Test Generic method----------------");
		gt.testGenericMethodBoundedType(10, 2, 3);
		gt.testGenericMethodBoundedType("banana", "ppple", "aeach");
		StudentGeneric<String> studentWithName = new StudentGeneric<String>();
		StudentGeneric<Integer> studentWithId = new StudentGeneric<Integer>();
		studentWithName.setT("cicidi");
		studentWithId.setT(19);
		System.out.println("Test Generic Class------------------------");
		System.out.println("StudentID: " + studentWithId.getT() + " name is "
				+ studentWithName.getT());
	}

	public static <T> void testGenericMethod(T[] array) {
		Arrays.sort(array);
		System.out.println("Test Generic Method--------------------");
		for (T a : array) {
			System.out.print(a + "\t");
		}
		System.out.println();
	}

	public <T extends Comparable> T testGenericMethodBoundedType(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println(max);
		return max;
	}
}
