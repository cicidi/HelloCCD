package com.cicidi.string;

public class StringNewExmaple {
	public static void main(String[] args) {
		String a = new String("Linux");
		String b = new String("Linux");
		String c = "Linux";
		String d = "Linux";
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(a == c);
	}

}
