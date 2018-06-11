package com.gnng.simpleFactoryModel;


/**
 * 实现计算机功能
 * 输入A，B返回结果
 * @author gnng
 *
 */
public class Operation {
	
	private double numberA = 0.0;
	private double numberB = 0.0;
	
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	public double getResult() throws Exception{
		double result = 0.0;
		return result;
	}
	

}
