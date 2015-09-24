package com.cicidi.interview.regularexpression;

public class LengthValidator extends Validator {
	private boolean isValidate = false;

	@Override
	public boolean getStatus() {
		return this.isValidate;
	}

	@Override
	public <T> boolean validate(T str) {
		if (str instanceof String) {
			int length = ((String) str).length();
			if (length > 7 && length < 21) {
				this.isValidate = true;
			}
		}
		return this.isValidate;
	}

	public String toString() {
		if (!isValidate)
			return "length NOT validate";
		else
			return "length validate";
	}
}
