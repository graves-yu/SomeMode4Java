/**
 * 
 */
package com.graves.thread;

/**  
 * 	主线程等待所有子线程执行完毕再执行
 * <p>Title: AfterExcute</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月11日  
 */
public class AfterExcute {
	public static void main(String[] args) {
		System.out.println("主线程执行开始");
		Thread threadA = new Thread(new RunnableTest(), "线程A");
		threadA.start();
		try {
			threadA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("主线程执行结束");
	}
}

class RunnableTest implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "执行开始");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "执行结束");
	}
}
