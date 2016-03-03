package com.cicidi.factory;

import com.cicidi.factory.model.Log;
import com.cicidi.factory.model.LogConsole;
import com.cicidi.factory.model.LogFile;

public class SimpleLogFactory extends AbstractLogPattern {
	
	String logType = null;
	SimpleLogFactory(String logType) {
		this.logType = logType;
	}

	@Override
	public Log getLog() {
		Log log = null;
		if (logType == Const.LOG_CONSOLE) {
			log = new LogConsole();
		}
		if (logType == Const.LOG_FILE) {
			log = new LogFile();
		}

		return log;

	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}
}
