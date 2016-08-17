package com.zyy.class1;
/**
 * 用于已有一个父类时，还想创建线程类时，通过实现Runnable接口
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MyThread4 implements Runnable{

	@Override
	public void run() {
		System.out.println("运行中！！");
	}

}
