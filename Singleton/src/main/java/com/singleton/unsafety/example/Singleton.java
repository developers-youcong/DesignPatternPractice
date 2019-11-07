package com.singleton.unsafety.example;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	/**
	 * 限制产生多个对象
	 */
	private Singleton() {
		
	}
	
	
	
	/**
	 * 通过该方法获取实例对象
	 * @return
	 */
	public static Singleton getSingleton() {
		
		if(singleton == null) {
			
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
