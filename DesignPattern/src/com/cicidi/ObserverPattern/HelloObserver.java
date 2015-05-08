package com.cicidi.ObserverPattern;

public class HelloObserver extends Observer {
	public HelloObserver(Subject subject) {
		this.subject = subject;
		this.subject.attchObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (this.subject.getState() <= this.subject.empty)
			System.out.println(this.subject.getState() + "Hello CiCiCiDi");

	}
}
