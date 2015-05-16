package com.cicidi.string;

public class ReverseSentence {
	public static void main(String argv[]) {
		String sentence = "1 My name is rachana, but I like name rajashree! 234 I like 123456cooking";
		System.out.println(reverseSentence(sentence));
	}

	private static String reverseSentence(String sentence) {
		StringBuffer reversed = new StringBuffer();
		char[] chars = sentence.toCharArray();
		for (int i = 0; i < chars.length - 1; i++) {
			if (!isChar(chars[i])) {
				reversed.append(chars[i]);
			} else {
				int j = i;
				StringBuffer word = new StringBuffer();
				while (isChar(chars[j]) && j < chars.length - 1) {
					word.append(chars[j]);
					j++;
				}
				String wordR = reverse(word.toString());
				reversed.append(wordR);
				i = j - 1;
			}
		}
		return reversed.toString();
	}

	private static boolean isChar(char c) {
		if ((c > 64 && c < 90) || (c > 96 && c < 122)) {
			return true;
		}
		return false;
	}

	private static String reverse(String word) {
		char[] A = word.toCharArray();
		int max = word.length() - 1;
		int min = 0;

		while (min < max) {
			char temp = A[max];
			A[max] = A[min];
			A[min] = temp;
			max--;
			min++;
		}
		return new String(A);
	}
}