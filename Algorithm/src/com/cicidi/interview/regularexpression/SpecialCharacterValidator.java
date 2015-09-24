package com.cicidi.interview.regularexpression;

public class SpecialCharacterValidator extends Validator {
	private boolean isValidate = false;
	private final String special = "!@#$%^&-_+<>";

	@Override
	public boolean getStatus() {
		return this.isValidate;
	}

	@Override
	public <T> boolean validate(T c) {
		if (c instanceof Character) {
			if (special.indexOf((Character) c) > 0) {
				this.isValidate = true;
			}
		}
		return this.isValidate;

	}

	public String toString() {
		if (!this.isValidate)
			return "specialcharacter NOT validate";
		else
			return "specialcharacter validate";
	}
}
