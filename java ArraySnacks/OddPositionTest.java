import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddPositionTest {

	@Test
	public void testOddPositionIntegers() {
	
		int[] arrayOfIntegers = {0, 1, 2, 3, 4, 5};
		
		int[] expectedOutput = {1, 3, 5};

		int[] actualOutput = OddPosition.oddPositionIntegers(arrayOfIntegers);

		assertArrayEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testOddPositionString() {

		String[] arrayOfStrings = {"Ant", "Bear", "Cat", "Dog", "Elephant", "Fish", "Giraffe"};
		
		String[] expectedOutput = {"Bear", "Dog", "Fish"};

		String[] actualOutput = OddPosition.oddPositionStrings(arrayOfStrings);

		assertArrayEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testOddPositionCharacters() {

		char[] arrayOfCharacters = {'a', 'b', 'c', 'd', 'e', 'f'};

		char[] expectedOutput = {'b', 'd', 'f'};

		char[] actualOutput = OddPosition.oddPositionCharacters(arrayOfCharacters);
	
		assertArrayEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testOddPositionBooleans() {

		boolean[] arrayOfBooleans = {true, false, true, false, true, false};
	
		boolean[] expectedOutput = {false, false, false};

		boolean[] actualOutput = OddPosition.oddPositionBooleans(arrayOfBooleans);

		assertArrayEquals(expectedOutput, actualOutput);

	}

}