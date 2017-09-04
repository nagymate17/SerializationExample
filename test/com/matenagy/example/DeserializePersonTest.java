package com.matenagy.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DeserializePersonTest {
	
	
	String path = "/tmpTest/person.ser";
	List<Person> p = new ArrayList<Person>();
	
	Person one = new Person("Mate","Nagy", 26,82.4);
	Person two = new Person("Bela","Kovacs", 34,76.3);
	Person three = new Person("Emese","Horvath", 19,55.1);

	@Test
	public void testDeserializeOne() {
		new SerializePerson(path,one);
		p = new DeserializePerson(path).getPersons();
		assert(p.size() == 1 || p.toString() == one.toString());
	}
	
	@Test
	public void testDeserializeTwo() {
		new SerializePerson(path,one,two);
		p = new DeserializePerson(path).getPersons();
		assert(p.size() == 2 || p.toString() == one.toString() + two.toString());
	}


}
