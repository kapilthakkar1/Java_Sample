package com.cloudwick.training.core.threads;

public class FileProcessing extends Thread {
	
	
	private String dirPath;
	public FileProcessing(String dirPath)
	{
		this.dirPath=dirPath;
	}


@Override
public void run(){
	
	//ToDo:Loop through & read files data in directory
	System.out.println("Analysed directory:"+this.dirPath+"Thread:"+Thread.currentThread());
}
	
}
