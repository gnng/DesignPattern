package com.gnng.strategyPattern;

/**
 * 策略模式+简单工厂模式
 * 策略模式：策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们可以相互替换，让算法独立于使用它的客户而独立变化。
 * 			把一些为了得到相同结果，不同过程的算法封装起来。
 * 简单工厂模式：通过继承多态 达到不同场景创建不同对象
 * @author gnng
 *
 */
public class Context {
	
	private Strategy strategy;

	public Context(String type) {
		switch (type) {
		case "算法A":
			strategy = new ConcreteStrategyA();
			break;
		case "算法B":
			strategy = new ConcreteStrategyB();
			break;
		case "算法C":
			strategy = new ConcreteStrategyC();
			break;

		}
	}
	
	//上下文接口
	public void contextInterface(){
		strategy.AlgorithmInterface();
	}

}
