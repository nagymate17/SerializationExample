package com.matenagy.example;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class DeserializePerson {
	
	private List<Person> readPers = null;
	
	public DeserializePerson(){
		String path = "/tmp/person.ser";
		deserializeFunc(path);
	}

	public DeserializePerson(String path){
		deserializeFunc(path);
	}
	//we should take care of the validation of the given path
	
	private void deserializeFunc(String path){
		try{
			FileInputStream file = new FileInputStream(path);
			ObjectInputStream in = new ObjectInputStream(file);
			Person[] readObj = ((Person[]) in.readObject());
			readPers = Arrays.asList(readObj);
			in.close();
			file.close();
			
		} catch( IOException e){
			e.printStackTrace();
			
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
	public List<Person> getPersons(){
		return readPers;
	}
}
