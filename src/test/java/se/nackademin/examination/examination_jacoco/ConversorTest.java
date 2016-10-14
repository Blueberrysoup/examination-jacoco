package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	Conversor conversor = new Conversor();

	@Test
	public void testConversor() {
		Conversor conv = new Conversor();
		conv.setNameConverterArrayValues();
		assertEquals(conv.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}

	@Test
	public void testSetAndGetName() {
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(1), "Your last name is smaller than your first name");
		assertEquals(conversor.getNameConverterArray().get(2), "The lengths of your first name is your last name are the same");
	}
	
	@Test
	public void testSetAndGetAge() {
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
		assertEquals(conversor.getAgeConverterArray().get(1), "You are experienced and talented! Things will come your way soon enough!");
	}

	@Test
	public void testSetAndGetGender() {
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
		assertEquals(conversor.getGenderConverterArray().get(2), "person!");
	}

	@Test
	public void testSetAndGetCity() {
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");
		assertEquals(conversor.getCityConverterArray().get(10), " a letter that comes after J, ");
	}
}
