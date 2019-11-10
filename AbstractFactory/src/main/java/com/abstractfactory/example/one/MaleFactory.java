package com.abstractfactory.example.one;

/**
 * 生产男性的八卦炉
 * @author youcong
 *
 */
public class MaleFactory implements HumanFactory {

	//生产出黄人男性
	public Human createYelloHuman() {
		
		return new MaleYelloHuman();
	}

	//生产出白人男性
	public Human createWhiteHuman() {
		
		return new MaleWhiteHuman();
	}

	//生产出黑人男性
	public Human createBlackHuman() {
		
		return new MaleBlackHuman();
	}



}
