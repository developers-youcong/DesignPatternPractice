package com.template.model.example;

/**
 * 场景类
 * @author youcong
 *
 */
public class Client {

	public static void main(String[] args) {
		
		AbstractClass class1 = new ConcreateClass1();
		
		AbstractClass class2 = new ConcreateClass2();
		
		//调用模板方法
		class1.templateMethod();
		
		class2.templateMethod();
	}
}
