package com.matenagy.example;

import java.io.*;

public class SerializePerson {
	
	public SerializePerson(String path ,Person... person){
		serializeFunc(path,person);
		
	}
	public SerializePerson(Person... person){
		String path = "/tmp/person.ser"; //default directory and filename
		serializeFunc(path,person);
		
	}
	
	private void serializeFunc(String path,Person... person){
		try{
			File file1 = new File(path);
			file1.setWritable(true);
			file1.getParentFile().mkdirs();
			file1.createNewFile();
			FileOutputStream file =  new FileOutputStream(file1,false);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(person);
			out.flush();
			out.close();
			file.close();		
		}catch(IOException e){
			e.printStackTrace();
		}finally{
		//	file1.setWritable(false);
		}
	}

}
