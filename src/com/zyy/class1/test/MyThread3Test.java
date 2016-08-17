package com.zyy.class1.test;

import com.zyy.class1.MyThread3;

/**
 * 测试start的执行顺序不是线程的启动顺序
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread3Test {

	public static void main(String[] args) {
		MyThread3 myThread1 = new MyThread3(1);
		MyThread3 myThread2 = new MyThread3(2);
		MyThread3 myThread3 = new MyThread3(3);
		MyThread3 myThread4 = new MyThread3(4);
		MyThread3 myThread5 = new MyThread3(5);
		MyThread3 myThread6 = new MyThread3(6);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
		myThread6.start();
	}
	
	
	
}
