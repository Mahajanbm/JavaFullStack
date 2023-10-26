package com.example.objectcreation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.ClosedByInterruptException;

public class Deserialization implements Serializable {
	String string;

	public Deserialization(String string) {
		//	super();
		this.string = string;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Deserialization d1=new Deserialization("Mahajan");
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Admin\\Demo1\\Project123\\src\\Demo.txt");
		ObjectOutputStream oStream=new ObjectOutputStream(f1);
		oStream.writeObject(d1);
		oStream.close();
		f1.close();
	}

}
