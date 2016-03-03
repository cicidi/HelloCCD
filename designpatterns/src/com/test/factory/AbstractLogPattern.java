package com.test.factory;

import com.test.factory.model.Log;

public abstract class AbstractLogPattern {
	public abstract boolean isNil();

	public abstract Log getLog();

	public static AbstractLogPattern getSingletonInstance() {
		return new NullLogFactory();
	}
	
}
