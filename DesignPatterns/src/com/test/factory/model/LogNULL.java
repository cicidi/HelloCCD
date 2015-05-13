package com.test.factory.model;


public class LogNULL extends Log {

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("-N  Use the NullObject log strategy\n-C  Use the Console log strategy\n-F  filename.txt use the File log strategy and log output to the filename provided");
	}

}
