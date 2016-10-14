package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	DataAnalysis dataAnalysis = new DataAnalysis();

	@Test
	public void test_ShorterFirstName_Under30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "25", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void test_LongerFirstName_Over30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "35", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}

	@Test
	public void test_LongerFirstName_Under30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'No analysis was performed' ",
				result.contains("No analysis was performed"));
	}
	
	@Test
	public void test_ShorterFirstName_Over30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "35", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'No analysis was performed' ",
				result.contains("No analysis was performed"));
	}

	@Test
	public void test_BigCity_Over30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}

	@Test
	public void test_BigCity_Under30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30' ",
				result.contains("The name of the homecity is big and the participant is younger than 30"));		
	}

	@Test
	public void test_SmallCity_Over30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "35", "Fort"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older' ",
				result.contains("The name of the homecity is small and the participant is 30 or older"));		
	}

	@Test
	public void test_SmallCity_Under30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Fort"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
				result.contains("The name of the homecity is small and the participant is younger than 30"));		
	}
}
