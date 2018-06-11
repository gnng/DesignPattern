package com.gnng.simpleFactoryModel;

public class OperationSub extends Operation{
	
	@Override
	public double getResult() {
		return getNumberA() - getNumberB();
	}

}
