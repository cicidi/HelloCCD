package com.cicidi.interview.regularexpression;

public class DigitalValidator extends Validator {
	private boolean isValidate = false;

	@Override
	public boolean getStatus() {
		return this.isValidate;
	}

	@Override
	public <T> boolean validate(T c) {
		if (c instanceof Character) {
			if ((Character) c > 47 && (Character) c < 58) {
				this.isValidate = true;
			}
		}
		return this.isValidate;
	}

	public String toString() {
		if (!isValidate)
			return "Digital NOT validate";
		else
			return "Digital  validate";
	}
}