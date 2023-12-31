import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConcatenateTwoArraysTest {

	@Test
	public void testConcatenateTwoArraysTest1() {

		int[] arrayOfIntegers = {1, 2, 3, 4};

		String[] arrayOfStrings = {"Apples", "Bananas", "Cherrys", "Dates"};
	
		String[] expectedOutput = {"1", "2", "3", "4", "Apples", "Bananas", "Cherrys", "Dates"};
	
		String[] actualOutput = ConcatenateTwoArrays.concatenateIntegerStringArrays(arrayOfIntegers, arrayOfStrings);
		
		assertArrayEquals(expectedOutput, actualOutput);  

	}

	@Test
	public void testConcatenateTwoArraysTest2() {

		int[] arrayOfIntegers = {1, 2, 3, 4, 5};

		String[] arrayOfStrings = {"Ant", "Bear", "Cat", "Dog", "Elephant"};

		String[] expectedOutput = {"1", "2", "3", "4", "5", "Ant", "Bear", "Cat", "Dog", "Elephant"};
	
		String[] actualOutput = ConcatenateTwoArrays.concatenateIntegerStringArrays(arrayOfIntegers, arrayOfStrings);
		
		assertArrayEquals(expectedOutput, actualOutput);  

	}

}

