package com.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.Greetings;
@DisplayName(value="My first Junit test case")
class TestGreeting {

	private Greetings grtObj=new Greetings();
	@Test
	@Disabled("Not used provided by Default")
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName(value="Test Message is not returning not null")
	void testGetMessageReturnsNotNull()
	{
		String actual=grtObj.getMessage();
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value="Test for getMessage to return Hello")
	void testGetMessageReturnsString()
	{
		String actual=grtObj.getMessage();
		assertEquals("Hello", actual);
	}
	@Test
	@DisplayName(value="test for getMessage using assertAll")
	void testMoreThanOneCase()
	{
		assertAll(
				
				() -> assertNotNull(grtObj.getMessage()),
				() -> assertEquals(5, grtObj.getMessage().length()),
				() -> assertEquals("Hello", grtObj.getMessage())
				
				);
	}

}
