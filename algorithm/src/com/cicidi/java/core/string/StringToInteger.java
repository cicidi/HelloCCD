package com.cicidi.java.core.string;
import java.util.ArrayList;
import java.util.List;

public class StringToInteger {
	static int output;

	/*
	 * a String of number get the Integer value of this number
	 */
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		String number = "344456";
		getValue(number);
		System.out.println(output);

	}

	public static void getValue(String number) {
		int i = number.length();

		for (int j = 0; j < i; j++) {
			char temp = number.charAt(j);
			int m = (int) temp;
			output = (int) (output + (m - 48) * Math.pow(10, i - j - 1));
		}
	}
}