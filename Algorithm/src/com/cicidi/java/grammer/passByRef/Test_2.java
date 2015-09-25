package com.cicidi.java.grammer.passByRef;

public class Test_2 {

	public static void main(String[] arg) {
		StringBuilder toyNumber = new StringBuilder("5");
		play(toyNumber);
		System.out.println("Toy number in main " + toyNumber);
	}

	private static void play(StringBuilder toyNumber) {
		System.out.println("Toy number in play " + toyNumber);
		toyNumber.append(" + 1");
		System.out.println("Toy number in play after increement " + toyNumber);
	}
}
