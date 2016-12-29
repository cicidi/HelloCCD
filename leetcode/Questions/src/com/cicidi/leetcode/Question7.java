package com.cicidi.leetcode;

public class Question7 {

	public static void main(String[] args) {

		Question7 question7 = new Question7();

		System.out.println(question7.reverse(123));

		System.out.println(question7.reverse(1534236469));

	}

	public int reverse(int x) {

		long y = 0;

		while (x != 0) {

			y = y * 10;

			y += x % 10;

			x = x / 10;

		}

		int tmp = (int) y;

		if (tmp != y) {

			return 0;

		}

		return tmp;

	}

}
