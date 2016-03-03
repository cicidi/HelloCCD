package com.cicidi.interview.homework.regularexpression;

public class LowerCaseValidator extends Validator {
	private boolean isValidate = false;

	@Override
	public boolean getStatus() {
		return this.isValidate;
	}

	@Override
	public <T> boolean validate(T c) {
		if (c instanceof Character) {
			if ((Character) c > 96 && (Character) c < 123) {
				this.isValidate = true;
			}
		}
		return this.isValidate;

	}

	public String toString() {
		if (!this.isValidate)
			return "lowercase NOT validate";
		else {
			return "lowercase  validate";
		}
	}
}
