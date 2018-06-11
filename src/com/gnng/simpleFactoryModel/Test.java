package com.gnng.simpleFactoryModel;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("请输入数字A:");
			double nubmerA = reader.nextDouble();
			System.out.println("请输入数字B:");
			double nubmerB = reader.nextDouble();
			Operation operation = OperationFactory.createOperate("/");
			operation.setNumberA(nubmerA);
			operation.setNumberB(nubmerB);
			System.out.println(operation.getResult());
		} catch (Exception e) {
			System.out.println("您的输入有误："+e.getMessage());
		}
	}

}
