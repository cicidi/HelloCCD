package com.test.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Command here : ");
		try {
			BufferedReader bufferRead = new BufferedReader(
					new InputStreamReader(System.in));
			String input = bufferRead.readLine().toUpperCase();

			System.out.println(input);
			if (input == "F")
				System.out.println("true");
			else
				System.out.println("false");
			System.out.println(input);
			AbstractLogPattern logpattern = LogPatternDecesion.getLog(input);
			System.out.println("before");
			logpattern.getLog().output();
			System.out.println("after");
		}

		// LogPatternDecesion.getLog("C").getLog("C").getLog();

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
