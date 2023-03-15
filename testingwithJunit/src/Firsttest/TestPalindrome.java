package Firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPalindrome {
Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPalindrome() {
		int n=121;
		boolean expectedValue=true;
		boolean actualValue=calc.palindrome(n);
		assertEquals(expectedValue,actualValue);
		
		
		//fail("Not yet implemented");
	}

}
