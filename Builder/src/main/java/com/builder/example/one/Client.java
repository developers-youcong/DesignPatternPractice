package com.builder.example.one;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		/**
		 * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大,
		 * 说要这样一个模型，这样一个顺序，然后我就来制造
		 */
		BenzModel benz = new BenzModel();
		
		//存放run的顺序
		ArrayList<String> sequence = new ArrayList<String>();
		
		sequence.add("engine boom");
		
		sequence.add("start");
		
		sequence.add("stop");
		
		benz.setSequence(sequence);
		
		benz.run();
	}
}
