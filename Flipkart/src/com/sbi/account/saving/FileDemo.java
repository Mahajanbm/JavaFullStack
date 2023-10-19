package com.sbi.account.saving;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileDemo implements Serializable {
	String str;
	

	public FileDemo(String str) {
		//super();
		this.str = str;
	}


	public static void main(String[] args) throws IOException {


		FileDemo f1=new FileDemo("mahajan");
		FileOutputStream fs=new FileOutputStream("C:\\Users\\Admin\\Demo1\\Flipkart\\src\\demo.txt");
		ObjectOutputStream oStream=new ObjectOutputStream(fs);
		oStream.writeObject(f1);
		System.out.println("Done");
		oStream.close();
		fs.close();


	}
}
