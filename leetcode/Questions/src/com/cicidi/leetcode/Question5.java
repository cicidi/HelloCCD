package com.cicidi.leetcode;

public class Question5 {

	public Question5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// String test = "abcdefg";
		String test = "nn";
		Question5 question5 = new Question5();
		System.out.println(question5.longestPalindrome(test));
	}

	public String longestPalindrome(String s) {
		int[] location = new int[] { 0, 0 };
		int[] location2 = new int[] { -1, -1 };
		String result = "";
		int size =0;
		for (int i = 0; i < s.length(); i++) {
			int j = 0;
			while (i + j < s.length() && i - j >= 0 && s.charAt(i - j) == s.charAt(i + j)) {
				int tmp = 1 + 2 * j;
				if (tmp > size) {
					location[0] = i;
					location[1] = j;
					size = tmp;//忘记update size
				}
				j++;
			}
		}
		if (s.length() > 1) {
			for (int i = 0; i < s.length(); i++) {
				int j = 0;
				while (i >= j&& i + j + 1 < s.length() && s.charAt(i - j) == s.charAt(i + 1 + j)) {//better use i-j>=0 instead of i>=j  follow the what i use for the index.
					// also   i+j+1<s.length()  dont write as i<s.length-j-1;
					int tmp = 2 + 2 * j;
					if (tmp > size) {
						location2[0] = i;
						location2[1] = j;
						size = tmp;
					}
					j++;
				}
			}
		}

		if (location2[0] >= 0) {
			int start = location2[0] - location2[1]; // do not use 1, 2 in the
														// naming , get confused
														// soon
			int end = location2[0] + 1 + location2[1] + 1;
			result = s.substring(start, end);
		} else {
			int start = location[0] - location[1];
			int end = location[0] + location[1] + 1;
			result = s.substring(start, end);
		}
		return result;
	}
}
