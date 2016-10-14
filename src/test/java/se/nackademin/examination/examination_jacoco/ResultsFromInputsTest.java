package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	ResultFromInputs resultsFromInputs = new ResultFromInputs();
	
	@Test
	public void testNameLengthGettersAndSettersMethods() {
		resultsFromInputs.setResultForNameLenght(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForNameLenght(), 0);
	}

	@Test
	public void testAgeGettersAndSettersMethods() {
		resultsFromInputs.setResultForAge(1);
		assertEquals("The result should be 1", resultsFromInputs.getResultForAge(), 1);
	}

	@Test
	public void testGenderGettersAndSettersMethods() {
		resultsFromInputs.setResultForGender(2);
		assertEquals("The result should be 2", resultsFromInputs.getResultForGender(), 2);
	}

	@Test
	public void testHomeCityGettersAndSettersMethods() {
		resultsFromInputs.setResultForHomeCity(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForHomeCity(), 10);
	}

}
