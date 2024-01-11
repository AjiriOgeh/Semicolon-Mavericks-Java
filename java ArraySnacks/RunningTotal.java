import java.util.Arrays;

public class RunningTotal { 
	
	public static void main(String[] args) {
	
		double[] numbersArray1 = {1, 2, 3, 4, 5, 6};
		double[] numbersArray2 = {10, 40, 50, 90};
		
		double[] runningTotal1 = runningTotalOfArray(numbersArray1);
		double[] runningTotal2 = runningTotalOfArray(numbersArray2);
		
		System.out.printf("The running total: %s%n", Arrays.toString(runningTotal1));
		System.out.printf("The running total: %s%n", Arrays.toString(runningTotal2));

	}

	public static double[] runningTotalOfArray(double[] numbersArray){

		double total = 0;
		
		double[] runningArray = new double[numbersArray.length];

		for(int count = 0; count < numbersArray.length; count++) {	
			total += numbersArray[count];

			runningArray[count] = total;
		
			
		}
		
		return runningArray;
	}

}