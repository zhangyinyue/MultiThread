package com.zyy.class1.test;

import com.zyy.class1.MyThread5;

/**
 * 
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread5Test {

	public static void main(String[] args) {
		//不共享数据
		/*MyThread5 myThreadA = new MyThread5("A");
		MyThread5 myThreadB = new MyThread5("B");
		MyThread5 myThreadC = new MyThread5("C");
		myThreadA.start();
		myThreadB.start();
		myThreadC.start();*/
		
		//共享数据
		MyThread5 myThreadA = new MyThread5();
		Thread A = new Thread(myThreadA,"A");
		Thread B = new Thread(myThreadA,"B");
		Thread C = new Thread(myThreadA,"C");
		A.start();
		B.start();
		C.start();
	}
}
