import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CombineTwoArraysAlternativelyTest { 


	@Test
	public void testCombineTwoArraysAlternativelyTest1() {

		int[] arrayOfIntegers = {1, 2, 3, 4};

		String[] arrayOfStrings = {"Apples", "Bananas", "Cherrys", "Dates"};
	
		String[] expectedOutput = {"1", "Apples", "2", "Bananas", "3", "Cherrys", "4", "Dates"};
	
		String[] actualOutput = CombineTwoArraysAlternatively.combineIntegerAndStringArraysAlternatively(arrayOfIntegers, arrayOfStrings);
		
		assertArrayEquals(expectedOutput, actualOutput);  

	}

	@Test
	public void testCombineTwoArraysAlternativelyTest2() {

		int[] arrayOfIntegers = {1, 2, 3, 4, 5};

		String[] arrayOfStrings = {"Ant", "Bear", "Cat", "Dog", "Elephant"};

		String[] expectedOutput = {"1", "Ant", "2", "Bear", "3", "Cat", "4", "Dog", "5", "Elephant"};
	
		String[] actualOutput = CombineTwoArraysAlternatively.combineIntegerAndStringArraysAlternatively(arrayOfIntegers, arrayOfStrings);
		
		assertArrayEquals(expectedOutput, actualOutput);  

	}

}