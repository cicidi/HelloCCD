package com.cicidi.factory;

import com.cicidi.factory.model.Log;
import com.cicidi.factory.model.LogNULL;

public class NullLogFactory extends AbstractLogPattern{

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Log getLog() {
		// TODO Auto-generated method stub
		return new LogNULL();
	}

}
