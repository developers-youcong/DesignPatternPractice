package com.abstractfactory.example.two;

public abstract class AbstractProductB {
	   //每个产品共有的方法
		public void shareMethd() {
			
		}
		
		//每个产品相同方法，不同实现
		public abstract void doShomething();
}
