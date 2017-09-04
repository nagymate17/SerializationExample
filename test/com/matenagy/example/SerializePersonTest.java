package com.matenagy.example;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SerializePersonTest {
	
	String path = "/tmpTest/person.ser";
	File file1 = new File(path);
	Person one , two ,three ;
	
	
	@Before
	public void creatingObjects(){
	    one = new Person("Mate","Nagy", 26,82.4);
		two = new Person("Bela","Kovacs", 34,76.3);
		three = new Person("Emese","Horvath", 19,55.1);
	}

	
	@Test
	public void testOnePerson() {
		new SerializePerson(path,one);
		assert(file1.exists());
	}
	
	@Test
	public void testTwoPerson() {
		new SerializePerson(path,one,two);
		assert(file1.exists());
	}
	
	@After
	public void removePath(){
		file1.delete();	
	}
	

}
