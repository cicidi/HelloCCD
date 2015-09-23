package com.cicidi.interview;

import java.util.Collection;
import java.util.HashSet;

public class Anagram_cicidi {

	public static Collection<String> getAllAnagrams(String str) {
		HashSet<String> set = new HashSet<String>();
		if (str == null) {
			return null;
		}
		if (str.isEmpty()) {
			set.add("");
			return set;
		}
		char firstChar = str.charAt(0);
		String remain = str.substring(1);
		Collection<String> words = getAllAnagrams(remain);
		for (String word : words) {
			// 这里的这个＝号很重要　　没有这个等号，整个program　就不会往set里面加东西了
			for (int i = 0; i <= word.length(); i++) {
				set.add(charAdd(word, firstChar, i));
			}

		}
		return set;
	}

	public static String charAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}

	public static void main(String args[]) {
		Collection<String> anagrams = getAllAnagrams("hello");
		for (String a : anagrams)
			System.out.println(a);

	}
}