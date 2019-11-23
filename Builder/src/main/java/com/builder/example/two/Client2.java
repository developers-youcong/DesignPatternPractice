package com.builder.example.two;

/**
 * 导演类
 * @author youcong
 *
 */
public class Client2 {

	public static void main(String[] args) {
		Director director = new Director();
		
		//1万辆A类型的奔驰车
		for (int i = 0; i < 10000; i++) {
			
			director.getABenzModel().run();
		}
		
		
		//1万辆B类型的奔驰车
		for (int i = 0; i < 10000; i++) {
			director.getBBenzModel().run();
		}
		
		//1万辆C类型的奔驰车
		for (int i = 0; i < 10000; i++) {
			director.getCBMWModel().run();
		}
	}
}
