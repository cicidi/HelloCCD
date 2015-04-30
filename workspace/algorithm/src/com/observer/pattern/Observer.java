package com.observer.pattern;

import javax.security.auth.Subject;

public abstract class Observer {
	protected Subject subject;
	private int state;

	public abstract void update();
}
