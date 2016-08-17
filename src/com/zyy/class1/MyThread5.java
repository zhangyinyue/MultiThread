package com.zyy.class1;
/**
 * 不共享数据
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread5 extends Thread{

	private int count = 5;
	
	public MyThread5() {
	}
	public MyThread5(String name) {
		super.setName(name);
	}
	@Override
	synchronized public void run() {
		super.run();
		count++;
		System.out.println("run = "+this.getName()+"count="+count);
	}
}
