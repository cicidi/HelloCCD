package com.cicidi.interview.regularexpression;

import java.util.ArrayList;
import java.util.List;

public class ValidatorChainTask {
	private final List<Validator> validatorList = new ArrayList<Validator>();
	private int totalvalidate = 0;

	public ValidatorChainTask() {
	}

	public List<Validator> getValidatorChain() {
		return validatorList;
	}

	public void add(Validator v) {
		validatorList.add(v);
	}

	public <T> void validate(T c) {
		for (Validator v : validatorList) {
			if (!v.getStatus()) {
				if (v.validate(c)) {
					totalvalidate++;
				}
			}
		}
	}

	public boolean getStatus() {
		if (totalvalidate == validatorList.size())
			return true;
		else
			return false;
	}

	public int getTotalvalidate() {
		return totalvalidate;
	}

	public String print() {
		StringBuilder sb = new StringBuilder();
		for (Validator v : validatorList) {
			sb.append(v.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
