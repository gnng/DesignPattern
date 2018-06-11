package com.gnng.simpleFactoryModel;

public class OperationAdd extends Operation{
	
	@Override
	public double getResult() {
		return getNumberA()+getNumberB();
	}

}
