package com.abstractfactory.example.one;

/**
 * 八卦炉定义
 * @author youcong
 *
 */
public interface HumanFactory {

	//制造一个黄色人种
	public Human createYelloHuman();
	
	//制造一个白色人种
	public Human createWhiteHuman();
	
	//制造一个黑色人种
	public Human createBlackHuman();
}
