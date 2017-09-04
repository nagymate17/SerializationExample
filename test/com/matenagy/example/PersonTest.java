package com.matenagy.example;

import static org.junit.Assert.*;

import org.junit.*;

public class PersonTest {
	

	Person one = new Person("Mate","Nagy", 26,82.4);
	Person two = new Person("Bela","Kovacs", 34,76.3);
	Person three = new Person("Emese","Horvath", 19,55.1);


	@Test
	public void creationTest() {
		String expected = "Mate Nagy 26 years 82.4 kg";
		String examined = one.toString();
		assertEquals(expected,examined);
	}

}
