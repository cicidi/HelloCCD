package com.cicidi.specialNaming;
/*
 *  I use sublime for syntax check, here 
 *  take care of
 *  char "C" is lowercase
 *  toLowerCase method
 *  string.toCharArray 
 *  String.valufOf()
 *  if String, or StringBuilder does not have a subString   index=-1
 *  
 *  
 * */
public class Anagram {
	public static void main(String[] arg) {
		String str1 = "HelloWorld";
		String str2 = "HelloWorldd";

		System.out.println((new Anagram()).isAnagram(str1, str2));

	}

	public boolean isAnagram(String str1, String str2) {

		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}
		char[] array = str1.toLowerCase().toCharArray();
		StringBuffer sb = new StringBuffer(str2.toLowerCase());
		int index = -2;
		for (char a : array) {
			index = sb.indexOf(String.valueOf(a));
			if (index == -1) {
				return false;
			}
			sb.delete(index, index + 1);
		}
		return true;
	}
}