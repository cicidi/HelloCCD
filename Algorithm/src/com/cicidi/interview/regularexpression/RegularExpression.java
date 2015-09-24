package com.cicidi.interview.regularexpression;

public class RegularExpression {
	ValidatorChainTask chainTask;

	public void init() {
		chainTask = new ValidatorChainTask();
		chainTask.add(new LengthValidator());
		chainTask.add(new DigitalValidator());
		chainTask.add(new LowerCaseValidator());
		chainTask.add(new UpperCaseValidator());
		chainTask.add(new SpecialCharacterValidator());
	}

	public boolean run(String pwd) {
		init();
		char[] arr = pwd.toCharArray();
		chainTask.validate(pwd);
		for (char c : arr) {
			if (chainTask.getStatus())
				break;
			else if (chainTask.getTotalvalidate() < chainTask
					.getValidatorChain().size())
				chainTask.validate(c);
		}
		return chainTask.getStatus();
	}

	public static void main(String[] args) {
		RegularExpression re = new RegularExpression();
		re.init();
		ValidatorChainTask task = new ValidatorChainTask();
		String pwd = "goodPASS2";
		task.add(new LengthValidator());
		task.add(new DigitalValidator());
		task.add(new LowerCaseValidator());
		task.add(new UpperCaseValidator());
		task.add(new SpecialCharacterValidator());
		task.validate(pwd);
		char[] arr = pwd.toCharArray();
		for (char c : arr) {
			if (task.getStatus())
				break;
			else if (task.getTotalvalidate() < task.getValidatorChain().size())
				task.validate(c);
		}
		System.out.println(task.print());
	}
}
