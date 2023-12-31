import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RunningTotalTest {

	@Test
	public void testRunningTotalOfArray() {
		
		double[] numbersArray = {3, -5, -8, 13, -21, 34, -55, 89, 144};

		double expectedOutput = 194;
		
		double actualOutput = RunningTotal.runningTotalOfArray(numbersArray);

		assertEquals(expectedOutput, actualOutput);
		
	}

	@Test
	public void testRunningTotalOfArrayPositiveNumbers() {

		double[] numbersArray = {1, 2, 3, 4, 5};

		double expectedOutput = 15;

		double actualOutput = RunningTotal.runningTotalOfArray(numbersArray);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testRunningTotalOfArrayNegativeNumbers() {
		
		double[] numbersArray = {-2, -3, -5, -7, -11, -13};
		
		double expectedOutput = -41;

		double actualOutput = RunningTotal.runningTotalOfArray(numbersArray);

		assertEquals(expectedOutput, actualOutput);
	
	}

}