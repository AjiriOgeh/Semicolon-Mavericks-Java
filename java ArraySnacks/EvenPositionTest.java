import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenPositionTest { 


	@Test
	public void testEvenPositionIntergers() {

		int[] arrayOfIntegers = {0, 1, 2, 3, 4, 5, 6};
	
		int[] expectedOutput = {0, 2, 4, 6};
	
		int[] actualOutput = EvenPosition.evenPositionIntegers(arrayOfIntegers);
		
		assertArrayEquals(expectedOutput, actualOutput);  

	}

	@Test
	public void testEvenPositionStrings() {
		
		String[] arrayOfStrings = {"Apple", "Banana", "Cherry", "Date", "Eggplant", "Guava"};

		String[] expectedOutput = {"Apple", "Cherry", "Eggplant"};

		String[] actualOutput = EvenPosition.evenPositionStrings(arrayOfStrings);

		assertArrayEquals(expectedOutput, actualOutput);

	}	


	@Test
	public void testEvenPositionCharacters() {

		char[] arrayOfCharacters = {'a', 'b', 'c', 'd', 'e', 'f'};

		char[] expectedOutput = {'a', 'c', 'e'};

		char[] actualOutput = EvenPosition.evenPositionCharacters(arrayOfCharacters);

		assertArrayEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testEvenPositionBooleans() {

		boolean[] arrayOfBooleans = {true, false, true, false, true, false, true};
	
		boolean[] expectedOutput = {true, true, true, true};

		boolean[] actualOutput = EvenPosition.evenPositionBooleans(arrayOfBooleans);

		assertArrayEquals(expectedOutput, actualOutput);

	}

}