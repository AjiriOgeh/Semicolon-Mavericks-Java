import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTest {

	@Test
	public void testReverseIntegerArray() {

		int[] arrayOfIntegers = {1, 2, 3, 4, 5};

		int[] expectedOutput = {5, 4, 3, 2, 1};

		int[] actualOutput = ReverseArray.reverseIntegerArray(arrayOfIntegers);

		assertArrayEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testReverseDoubleArray() {

		double[] arrayOfDoubles = {0.15, 0.25, 0.35, 0.45, 0.55, 0.65};

		double[] expectedOutput = {0.65, 0.55, 0.45, 0.35, 0.25, 0.15};
		
		double[] actualOutput = ReverseArray.reverseDoubleArray(arrayOfDoubles);
	
		assertArrayEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testReverseStringArray() {

		String[] arrayOfStrings = {"Argentina", "Brazil", "Canada", "Denmark", "Egypt", "France", "Ghana"};

		String[] expectedOutput = {"Ghana", "France", "Egypt", "Denmark", "Canada", "Brazil", "Argentina"};

		String[] actualOutput = ReverseArray.reverseStringArray(arrayOfStrings);

		assertArrayEquals(expectedOutput, actualOutput);
	
	}

	@Test
	public void testReverseCharactersArray() {

		char[] arrayOfCharacters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		char[] expectedOutput = {'g', 'f', 'e', 'd', 'c', 'b', 'a'};

		char[] actualOutput = ReverseArray.reverseCharacterArray(arrayOfCharacters);

		assertArrayEquals(expectedOutput, actualOutput);

	}

}