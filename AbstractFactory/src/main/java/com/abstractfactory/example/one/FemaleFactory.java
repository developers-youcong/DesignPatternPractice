package com.abstractfactory.example.one;

/**
 * 生产女性的八卦炉
 * @author youcong
 *
 */
public class FemaleFactory implements HumanFactory {

	
	//生产出黄人女性
	public Human createYelloHuman() {
	
		return new FemaleYelloHuman();
	}

	//生产出白人女性
	public Human createWhiteHuman() {
		
		return new FemaleWhiteHuman();
	}

	
	//生产出黑人女性
	public Human createBlackHuman() {
	
		return new FemaleBlackHuman();
	}

}
