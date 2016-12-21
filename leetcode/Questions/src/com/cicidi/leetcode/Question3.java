package com.cicidi.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.
abc
Given "bbbbb", the answer is "b", with the length of 1.

Given "pwbwcddcwke", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * */
public class Question3 {

	public static void main(String[] args) {
		System.out.println("test");
	}

	public int lengthOfLongestSubstring(String s) {

		return 0;
	}

	public char[] getDulicateChar(String str) {
		char[] charArray = str.toCharArray();
		Set<Character> duplicateChar = new HashSet<Character>();
		Set<Character> setChar = new HashSet<Character>();
		for (char c : charArray) {
			if (!setChar.add(c))
				duplicateChar.add(c);
		}
		return null;
	}

	public String removeCharFromHead(String str) {
		return null;
	}

	public String removeCharFromTail(String str) {
		return null;
	}
}
