package com.builder.example.two;

import java.util.ArrayList;

public class Client1 {

	public static void main(String[] args) {
		
		/**
		 * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大,
		 * 说要这样一个模型，这样一个顺序，然后我就来制造
		 */
		
		//存放run的顺序
		ArrayList<String> sequence = new ArrayList<String>();
		
		sequence.add("engine boom");
		
		sequence.add("start");
		
		sequence.add("stop");
		
		//要一个奔驰车
		BenzBuilder benzBuilder = new BenzBuilder();
		
		//把顺序给这个builder类，制造出这样一个车出来
		benzBuilder.setSequence(sequence);
		
		
		//制造出一个奔驰车
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();

		//奔驰车跑一下看看
		benz.run();
	}
}
