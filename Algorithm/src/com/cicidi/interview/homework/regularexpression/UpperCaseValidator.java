package com.cicidi.interview.homework.regularexpression;

public class UpperCaseValidator extends Validator {
	private boolean isValidate = false;

	@Override
	public boolean getStatus() {
		return this.isValidate;
	}

	@Override
	public <T> boolean validate(T c) {
		if (c instanceof Character) {
			if ((Character) c > 64 && (Character) c < 91)
				this.isValidate = true;
		}
		return this.isValidate;

	}

	public String toString() {
		if (!isValidate)
			return "uppercase NOT validate";
		else
			return "uppercase validate";
	}
}
