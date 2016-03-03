package com.cicidi.ObserverPattern;

import javax.security.auth.Subject;

public interface IObserver {
	public Subject subject = null;
	final static int state = 0;

	public abstract void update();
}
