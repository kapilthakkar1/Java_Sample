package com.cloudwick.training.core.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Thread>threadList=new ArrayList<>();
		for(int i=0;i<1000;i++){
			
			FileProcessing fObj = new FileProcessing("Dir" + i);
			fObj.setName("Cloudwick"+i);
			if(i>50&&i<100){
				fObj.setPriority(Thread.MIN_PRIORITY);
			}
			fObj.start();
			threadList.add(fObj);
		}
		int running=0;
		do{
			running=0;
			for(Thread t:threadList){
				if(t.isAlive()){
					running++;
				}
			}
			
		}while(running!=0);
		
		
		System.out.println("All Threads Terminated");

	}

}
