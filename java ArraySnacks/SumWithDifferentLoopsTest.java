import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SumWithDifferentLoopsTest {

	@Test
	public void testSumWithForLoop() {
		
		double[] numbersArray = {2, 4, 6, 8, 10};

		double expectedOutput = 30;
		
		double actualOutput = SumWithDifferentLoops.sumWithForLoop(numbersArray);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testSumWithWhileLoop() {
		
		double[] numbersArray = {4, 8, 12, 16, 20};

		double expectedOutput = 60;
		
		double actualOutput = SumWithDifferentLoops.sumWithDoWhileLoop(numbersArray);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testSumWithDoWhileLoop() {
		
		double[] numbersArray = {3, -5, -8, 13, -21, 34, -55, 89, 144};

		double expectedOutput = 194;
		
		double actualOutput = SumWithDifferentLoops.sumWithDoWhileLoop(numbersArray);

		assertEquals(expectedOutput, actualOutput);

	}

}