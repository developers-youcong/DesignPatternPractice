package com.builder.example.two;

import java.util.ArrayList;

/**
 * 奔驰车组装者
 * @author youcong
 *
 */
public class BenzBuilder extends CarBuilder {
	
	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {		
		
		this.benz.setSequence(sequence);
	
	}

	@Override
	public CarModel getCarModel() {
		
		return this.benz;
	}

}
