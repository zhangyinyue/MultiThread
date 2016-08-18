package com.zyy.class1.test;

import com.zyy.class1.MyThread6;

/**
 * 
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread6Test {
	
	public static void main(String[] args) {
		MyThread6 myThread6 = new MyThread6();
		Thread thread = new Thread(myThread6);
		thread.setName("zhang");
		thread.start();
	}
}
