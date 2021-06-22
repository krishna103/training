package com.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import static java.time.Duration.ofMillis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.Calculator;

class TestCalculator {

	private Calculator calc=new Calculator();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all tests");
	}

	@BeforeEach
	void setUp(TestInfo info) throws Exception {
		System.out.println(info.getDisplayName()+"called");
	}

	@AfterEach
	void tearDown(TestInfo info) throws Exception {
		System.out.println(info.getDisplayName()+"calls");

	}

	@Test
	@DisplayName(value="Check the return value of the method")
	void testCalculateReturnValue() {
          double actual=calc.calculate("45","55","65");
          double expected=550;
          assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Check for Number Format exception")
	void testCalculateForException()
	{
		assertAll(
		() -> assertThrows(ArrayIndexOutOfBoundsException.class, 
				() ->calc.calculate("45")),
		() -> assertThrows(NumberFormatException.class, 
				() -> calc.calculate("Five","Four"))
		);
	}
	@Test
	@DisplayName("test method completes in 1000ms")
	void testCalculateForTimeOut() {
		assertTimeout(ofMillis(1000), () -> calc.calculate("45","55"));
	}
	
     @ParameterizedTest
     @ValueSource(ints= {1,3,5})
     @DisplayName("Test position in even position is not null")
     void testGetNameFromList(int idxpos)
     {
    	 LocalDate date=LocalDate.now();
    	 Assumptions.assumeTrue(date.getDayOfWeek().getValue()==0);
    	    assertNotNull(calc.getNameFromString(idxpos));
     }
}
