package com.observer.pattern;

import javax.security.auth.Subject;

public class CallObserver extends Observer {
	public CallObserver(Subject subject) {
		this.subject = subject;
		this.subject.attchObserver(this);
	}

	@Override
	public void update() {
		if (this.subject.getState() > subject.full)
			System.out.println(subject.getState() + "call cicidi");

	}

}
