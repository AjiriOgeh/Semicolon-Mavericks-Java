import java.util.Arrays;

public class RunningTotal { 
	
	public static void main(String[] args) {
	
		double[] numbersArray1 = {1, 2, 3, 4, 5, 6};
		double[] numbersArray2 = {10, 40, 50, 90};
		
		double total1 = runningTotalOfArray(numbersArray1);
		double total2 = runningTotalOfArray(numbersArray2);
		
		System.out.printf("The total is %.2f%n", total1);
		System.out.printf("The total is %.2f%n", total2);

	}

	public static double runningTotalOfArray(double[] numbersArray){

		double total = 0;

		for(int count = 0; count < numbersArray.length; count++) {	
			total += numbersArray[count];
		}
		
		return total;
	}

}