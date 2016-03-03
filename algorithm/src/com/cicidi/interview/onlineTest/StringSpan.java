package com.cicidi.interview.onlineTest;

/*
 find out a keyword in the string
 the span = first keyword and last keyword span 
 for example 
 FFSREABCXYZOSKJLJDYFDABCZK
 The value for ABC is 18
 */

public class StringSpan {
	public static void main(String[] args) {
		String str = "FFSREABCXYZOSKJLJDYFDABCZK";
		System.out.print(str.substring(0, str.length()));
		String keyword = "ABC";
		String sub;
		for (int i = 0; i < str.length() - keyword.length(); i++) {
			int start = i;
			int end = start + keyword.length();
			sub = str.substring(i, end);
			if (!sub.equals(keyword)) {
				continue;
			} else {
				str = str.substring(i);
				break;
			}
		}

		for (int j = str.length(); j >= keyword.length(); j--) {
			int start = j - keyword.length();
			int end = j;
			sub = str.substring(start, end);
			if (!sub.equals(keyword)) {
				continue;
			} else {
				str = str.substring(0, end);
				break;

			}
		}
		System.out.println("keyword :" + keyword + "span is :" + str.length());
	}
}
