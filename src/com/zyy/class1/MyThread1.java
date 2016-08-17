package com.zyy.class1;

/**
 * 线程执行不是按照代码的顺序的
 * @author zyy
 *
 */
public class MyThread1 extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
	
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		System.out.println("运行结束！");
	}
}
