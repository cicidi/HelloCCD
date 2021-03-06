package com.cicidi.finalKey;

import com.cicidi.context.Student;

public class FinalKeyWord {
	private final Student std = new Student();

	public static void main(String[] arg) {
		FinalKeyWord fk = new FinalKeyWord();
		System.out.println("Before setName: " + fk.getStudent().getName());
		fk.getStudent().setName("cicidi");
		System.out.println("After setNam: " + fk.getStudent().getName());
		System.out.println("Before setAge " + fk.getStudent().getAge());
		fk.getStudent().setAge(30);
		System.out.println("After setAge: " + fk.getStudent().getAge());
	}

	public Student getStudent() {
		return this.std;
	}
}