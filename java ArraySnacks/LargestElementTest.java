import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestElementTest {

	@Test
	public void testLargestElementInArray() {
		
		double[] numbersArray = {3, -5.5, 5000, -45, -250, 0.25, 750, -35.75};

		double expectedOutput = 5000;

		double actualOutput = LargestElement.largestElementInArray(numbersArray);

		assertEquals(expectedOutput, actualOutput);

	}
	
	@Test
	public void testLargestElementInArrayPositiveNumbers() {
		
		double[] numbersArray = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

		double expectedOutput = 30;

		double actualOutput = LargestElement.largestElementInArray(numbersArray);
	
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testLargestElementInArrayNegativeNumbers() { 

		double[] numbersArray = {-70, -50, -30, -10, -1, -100, -120, -140};

		double expectedOutput = -1;

		double actualOutput = LargestElement.largestElementInArray(numbersArray);

		assertEquals(expectedOutput, actualOutput);

	}

}