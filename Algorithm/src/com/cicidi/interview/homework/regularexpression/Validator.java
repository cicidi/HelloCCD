package com.cicidi.interview.homework.regularexpression;

public abstract class Validator {
	public abstract <T> boolean validate(T c);

	public abstract boolean getStatus();
}
