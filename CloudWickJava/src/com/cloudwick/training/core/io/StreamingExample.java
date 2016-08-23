package com.cloudwick.training.core.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

import com.cloudwick.training.core.exception.InvalidFileException;

public class StreamingExample {

	public static void main(String[] args) throws InvalidFileException {
		// TODO Auto-generated method stub
		WriteContent("abc", "Input.txt");
	}
      
	public static void WriteContent(String content,String filename) throws InvalidFileException{
		FileOutputStream fos = null;
		File fileobj = new File(filename);
		if(fileobj.exists()){
			throw new InvalidFileException("Duplicate File Name");
		}
		
		try{
			fos = new FileOutputStream(filename);
			String s = "I am working at Cloudwick";
			fos.write(s.getBytes());
			fos.flush();
		
		}catch( IOException e){
			e.printStackTrace();
		} finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
