package com.cicidi.dataStructure.java.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistFinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String> arraylist = Collections.unmodifiableList(new ArrayList<String>());
		ArrayList<String> arraylist2 = new ArrayList<String>();

		;
		arraylist.add("Abc");
		arraylist2 = new ArrayList<String>();
		System.out.println(arraylist.get(0));

	}
}
