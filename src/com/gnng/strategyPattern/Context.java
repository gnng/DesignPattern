package com.gnng.strategyPattern;

/**
 * ����ģʽ+�򵥹���ģʽ
 * ����ģʽ������ģʽ������һϵ�е��㷨������ÿһ���㷨��װ����������ʹ���ǿ����໥�滻�����㷨������ʹ�����Ŀͻ��������仯��
 * 			��һЩΪ�˵õ���ͬ�������ͬ���̵��㷨��װ������
 * �򵥹���ģʽ��ͨ���̳ж�̬ �ﵽ��ͬ����������ͬ����
 * @author gnng
 *
 */
public class Context {
	
	private Strategy strategy;

	public Context(String type) {
		switch (type) {
		case "�㷨A":
			strategy = new ConcreteStrategyA();
			break;
		case "�㷨B":
			strategy = new ConcreteStrategyB();
			break;
		case "�㷨C":
			strategy = new ConcreteStrategyC();
			break;

		}
	}
	
	//�����Ľӿ�
	public void contextInterface(){
		strategy.AlgorithmInterface();
	}

}
