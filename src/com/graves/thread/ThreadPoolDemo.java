/**
 * 
 */
package com.graves.thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**  
 * <p>Title: Test</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月18日  
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//阿里不允许创建线程池的方式：
		//允许的请求队列长度为 Integer.MAX_VALUE ,可能会堆积大量的请求,从而导致 OOM 。
		Executors.newSingleThreadExecutor();
		Executors.newFixedThreadPool(10);
		
		//允许的创建线程数量为 Integer.MAX_VALUE ,可能会创建大量的线程,从而导致 OOM 。
		Executors.newCachedThreadPool();
		Executors.newScheduledThreadPool(10);
		
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(
		        1, //corePoolSize
		        100, //maximumPoolSize
		        100, //keepAliveTime
		        TimeUnit.SECONDS, //unit
		        new LinkedBlockingDeque<>(100));//workQueue
		
		for (int i = 0; i < 5; i++) {
		    final int taskIndex = i;
		    executor.execute(() -> {
		        System.out.println(taskIndex);
		        try {
		            Thread.sleep(Long.MAX_VALUE);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    });
		}
		
		//定时线程池
		ScheduledThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(1);
		scheduled.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println(new Date());
			}
		}, 10, 10, TimeUnit.SECONDS);
		
	}
}
