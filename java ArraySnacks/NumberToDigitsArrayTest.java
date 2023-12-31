import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberToDigitsArrayTest {

	@Test
	public void testNumberToDigitsArray1() {

		String numberInInteger = "12345";
	
		int[] expectedOutput = {1, 2, 3, 4, 5};

		int actualOutput[] = NumberToDigitsArray.numberToDigitsArray(numberInInteger);

		assertArrayEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testNumberToDigitsArray2() {
	
		String numberInInteger = "757575";

		int[] expectedOutput = {7, 5, 7, 5, 7, 5};

		int[] actualOutput = NumberToDigitsArray.numberToDigitsArray(numberInInteger);

		assertArrayEquals(expectedOutput, actualOutput);

	}

}