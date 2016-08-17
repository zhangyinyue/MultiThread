package com.zyy.class1;
/**
 * 
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread3 extends Thread{

	private int i;
	
	public MyThread3(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println(i);
	}
	
}
