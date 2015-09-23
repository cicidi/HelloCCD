package com.test.factory;

public class LogPatternDecesion {

	public static AbstractLogPattern getLog(String logType) {

		if (logType==null)
			return AbstractLogPattern.getSingletonInstance();
		else
		return new SimpleLogFactory(logType);
		

	}
}
