package com.zyy.class1;

/**
 * 展示线程具有随机性
 * @author zyy
 *
 */
public class MyThread2 extends Thread{

	@Override
	public void run() {

		try {
			for(int i = 0; i < 10; i++){
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			System.out.println("运行出错");
		}
	}
	
	public static void main(String[] args) {
		try {
			
			MyThread2 myThread2 = new MyThread2();
			myThread2.setName("MyThread2");
			myThread2.start();
			for(int i = 0; i < 10; i++){
				int time = (int )(Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main = "+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			System.out.println("运行出错");
			
		}
	}
	
}
