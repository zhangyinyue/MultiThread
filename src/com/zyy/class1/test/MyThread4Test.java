package com.zyy.class1.test;

import com.zyy.class1.MyThread4;

/**
 * 
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread4Test {

	public static void main(String[] args) {
		MyThread4 myThread4 = new MyThread4();
		Thread thread = new Thread(myThread4);
		thread.start();
		System.out.println("运行结束！");
	}
}
