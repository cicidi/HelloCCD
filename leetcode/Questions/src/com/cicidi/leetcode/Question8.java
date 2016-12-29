package com.cicidi.leetcode;

public class Question8 {

	public static void main(String[] args) {

		Question8 question8 = new Question8();

		System.out.println(question8.myAtoi("18446744073709551617"));

		System.out.println(+-2);

	}

	// 这道题不是太容易 麻烦事太多

	/*
	 * 
	 * Input: "    010" Output: 0 Expected: 10， Input "12147483648" 这个会overflow
	 * 
	 */

	public int myAtoi(String str) {

		char[] array = str.toCharArray();

		// boolean start = false;

		long result = 0;

		int neg = 0;

		boolean hasOperaotr = false;

		boolean start = false;

		for (int i = 0; i < array.length; i++) {

			long ascii = (long) str.charAt(i);

			if (ascii == 32) {

				if (!start) {

					continue;

				} else {

					break;

				}

			}

			if ((ascii > 47 && ascii < 58) || (ascii == 45 || ascii == 43) && (!hasOperaotr)) {

				start = true;

				if (ascii > 47 && ascii < 58) {

					result *= 10;

					result += ascii - 48;

				} else {

					hasOperaotr = true;

					if (ascii == 45) {

						neg += -1;

						hasOperaotr = true;

					}

					if (ascii == 43) {

						neg += 1;

					}

				}

			} else {

				break;

			}

		}

		if (!hasOperaotr)

			neg = 1;

		if (result != (int) (result)) {

			result = neg > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			return (int) result;

		}

		return (int) result * neg;

	}

}
