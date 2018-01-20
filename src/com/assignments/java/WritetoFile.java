package com.assignments.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritetoFile {

	public static void main(String[] args) {
		
		String path = "C:/Users/HanMin/test1.txt";
		File file;
		String content = "Write this content on to the file";

		try(FileOutputStream fos = new FileOutputStream(path,true);) {
			
			file = new File(path);
			if(!file.exists()){
				file.createNewFile();
			}
			
			byte[] contentInBytes = content.getBytes();
			
			fos.write('\n');
			fos.write(contentInBytes);
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
