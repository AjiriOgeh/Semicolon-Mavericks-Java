import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RunningTotalTest {

	@Test
	public void testRunningTotalOfArray() {
		
		double[] numbersArray = {3, -5, -8, 13, -21, 34, -55, 89, 144};

		double[] expectedOutput = {3, -2, -10, 3, -18, 16, -39, 50, 194};
		
		double[] actualOutput = RunningTotal.runningTotalOfArray(numbersArray);

		assertArrayEquals(expectedOutput, actualOutput);
		
	}

	@Test
	public void testRunningTotalOfArrayPositiveNumbers() {

		double[] numbersArray = {1, 2, 3, 4, 5};

		double[] expectedOutput = {1, 3, 6, 10, 15};

		double[] actualOutput = RunningTotal.runningTotalOfArray(numbersArray);

		assertArrayEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testRunningTotalOfArrayNegativeNumbers() {
		
		double[] numbersArray = {-2, -3, -5, -7, -11, -13};
		
		double[] expectedOutput = {-2, -5, -10, -17, -28, -41};

		double[] actualOutput = RunningTotal.runningTotalOfArray(numbersArray);

		assertArrayEquals(expectedOutput, actualOutput);
	
	}

}