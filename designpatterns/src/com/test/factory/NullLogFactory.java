package com.test.factory;

import com.test.factory.model.Log;
import com.test.factory.model.LogNULL;

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
