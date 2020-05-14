/**
 * 
 */
package com.graves.thread;

/**  验证start()和run()的区别
 * <p>Title: ThreadDemo</p>  
 * <p>Description: 线程的五种状态：新建 - 就绪 - 运行 - 阻塞 - 死亡
 *				         
 *					创建了一个线程      	
 *								新建：新创建了一个线程对象。
 *					start()方法			
 *								就绪：线程对象创建后，其他线程(比如main线程）调用了该对象的start()方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获取cpu 的使用权 。
 *					run()方法
 *								运行：可运行状态(runnable)的线程获得了cpu 时间片（timeslice） ，执行程序代码。
 *					wait()			
 *					sleep()
 *								阻塞(等待阻塞，同步阻塞，其他阻塞)：阻塞状态是指线程因为某种原因放弃了cpu 使用权，也即让出了cpu timeslice，暂时停止运行。直到线程进入可运行(runnable)状态，才有机会再次获得cpu timeslice 转到运行(running)状态
 *									wait():等待阻塞   sleep():其他阻塞
 *					run()结束
 *								死亡：线程run()、main() 方法执行结束，或者因异常退出了run()方法，则该线程结束生命周期。死亡的线程不可再次复生。
 * 
 * 
 * </p>  
 * @author Graves  
 * @date 2020年5月14日  
 */
public class ThreadDemo {
	public static void main(String[] args){
        Thread thread1 = new Thread(new MyRunnable(), "线程A");
        Thread thread2 = new Thread(new MyRunnable(), "线程B");
        //直接使用对象调用方法，必须是这个方法执行完了代码才能往下走
        System.out.println("==========thread run ===========");
        thread1.run();
        thread2.run();

        //两个线程都是使用start方法开启的，所以并不需要等待另一个完成，所以他们的执行顺序应该是并行
        System.out.println("==========thread start ===========");
        thread1.start();
        thread2.start();
        
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
