package com.cloudwick.training.core.threads;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Monitoring {
	
	Timer timerObj;
	public Monitoring(int seconds){
		timerObj=new Timer();
		timerObj.schedule(new TimerMonitoring(),new Date(),seconds*1000);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Monitoring(5);

	}

}

class TimerMonitoring extends TimerTask{
	
	@Override
	public void run(){
		System.out.println("Timer Task Finished");
	}
	
}
