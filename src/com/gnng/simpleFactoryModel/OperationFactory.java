package com.gnng.simpleFactoryModel;

/**
 * 计算器工厂模式，通过不同计算方式，创建不同对象
 * @author gnng
 *
 */
public class OperationFactory {
	
	public static Operation createOperate(String operate){
		
		Operation operation = null;
		switch (operate) {
		case "+":
			operation =  new OperationAdd();
			break;
		case "-":
			operation =  new OperationSub();
			break;
		case "*":
			operation =  new OperationMul();
			break;
		case "/":
			operation =  new OperationDiv();
			break;
		}
		return operation;
	}
}
