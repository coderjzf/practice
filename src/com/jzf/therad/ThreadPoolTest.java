package com.jzf.therad;
import java.util.Date;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledThreadPoolExecutor;  
import java.util.concurrent.TimeUnit;  
  
/** 
 * 功能概要：缓冲线程池实例-execute运行 
 *  
 * @author linbingwen 
 * @since  2016年5月24日  
 */  
class Handle implements Runnable {  
    private String name;  
    public Handle(String name) {  
        this.name = "thread"+name;  
    }     
    @Override  
    public void run() {  
        System.out.println( name +" Start. Time = "+new Date());  
        processCommand();  
        System.out.println( name +" End. Time = "+new Date());  
    }  
     private void processCommand() {  
            try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
     @Override  
        public String toString(){  
            return this.name;  
        }     
}  
public class ThreadPoolTest {
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
/*		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
			executorService.execute(new Handle(i+""));
		}
		
		executorService.shutdown();*/
		
/*		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++){
			executorService.execute(new Handle(i+""));
		}
		
		executorService.shutdown();*/
		
		
/*		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i=0;i<20;i++){
			executorService.execute(new Handle(i+""));
		}
		
		executorService.shutdown();
		System.out.println(System.currentTimeMillis());*/
		
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(5);
		for(int i=0;i<20;i++){
			scheduledThreadPoolExecutor.scheduleWithFixedDelay(new Handle(i+""), 0, 1, TimeUnit.SECONDS);
		}
		
		
		
		while(!scheduledThreadPoolExecutor.isTerminated()){
			scheduledThreadPoolExecutor.shutdown();
		}
		
		System.out.println(System.currentTimeMillis());
	}
}
