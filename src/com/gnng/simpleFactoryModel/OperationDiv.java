package com.gnng.simpleFactoryModel;

public class OperationDiv extends Operation{
	
	@Override
	public double getResult() throws Exception {
		if(getNumberB() == 0.0){
			throw new Exception("除数不能为0！");
		}
		return getNumberA()/getNumberB();
	}

}
