package com.cloudwick.training.core.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsUtil {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(5);
		for(int i=0;i<1000;i++){
			FileProcessing fObj=new FileProcessing("Dir"+i);
			service.execute(fObj);
		}
		service.shutdown();
		FileProcessing fObj=new FileProcessing("Dir");
		service.execute(fObj);
		do{
			
		}while(!service.isTerminated());
		System.out.println("All threads done");

	}

}
