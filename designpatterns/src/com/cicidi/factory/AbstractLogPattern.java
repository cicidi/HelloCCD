package com.cicidi.factory;

import com.cicidi.factory.model.Log;

public abstract class AbstractLogPattern {
	public abstract boolean isNil();

	public abstract Log getLog();

	public static AbstractLogPattern getSingletonInstance() {
		return new NullLogFactory();
	}
	
}
