package com.cicidi.observe;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subject subject = new Subject();
		 new CallObserver(subject);
		 new HelloObserver(subject);
		 subject.setState(-1);
		 subject.setState(100);
//		System.out.println("hello");
	}

}
