package com.template.example;

public abstract class HummerModel {

	/**
	 * 首先这个模型要能发动起来，别管是手摇发动，还是电力发动，反正是要能够发动起来，那这个实现要在实现类里
	 */
	public abstract void start();
	
	
	//能发动，还要能停下来，那才是真本事
	public abstract void stop();
	
	//喇叭会发出声音，是滴滴叫，还是哗哗叫
	public abstract void alarm();
	
	//引擎会轰隆隆地响
	public abstract void engineBoom();

	//那模型应该会跑吧，别管是人推得，还是电力驱动，总之要会跑
	public void run() {
		//先发动汽车
		this.start();
		
		//引擎开始轰鸣
		this.engineBoom();
		
		//然后开始跑了，跑的过程遇到一条狗挡路，就按喇叭
		this.alarm();
		
		//到达目的地就停车
		this.stop();
	}
}
