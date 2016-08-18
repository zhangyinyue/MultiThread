package com.zyy.class1;
/**
 * 
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread6 extends Thread{

	public MyThread6() {
		
		System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName());
		System.out.println("This.getName()"+this.getName());
	}
	@Override
	public void run() {
		super.run();
		System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName());
		System.out.println("This.getName()"+this.getName());
	}
}
