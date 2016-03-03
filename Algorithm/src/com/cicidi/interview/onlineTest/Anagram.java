package com.cicidi.interview.onlineTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Anagram {

	public static Collection<String> getAllAnagrams(String str) {
		Set<String> result = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			result.add("");
			return result;
		}

		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Collection<String> words = getAllAnagrams(rem);
		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				result.add(charAdd(word, firstChar, i));
			}
		}
		return result;
	}

	public static String charAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}

	public static void main(String args[]) {
		Collection<String> anagrams = getAllAnagrams("like");
		for (String a : anagrams)
			System.out.println(a);

	}
}