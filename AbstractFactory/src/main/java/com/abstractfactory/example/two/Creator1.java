package com.abstractfactory.example.two;

/**
 * 产品等级1的实现类
 * @author youcong
 *
 */
public class Creator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		
		return new ProductB1();
	}

}
