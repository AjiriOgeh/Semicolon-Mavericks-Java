import java.util.Arrays;

public class SumWithDifferentLoops {

	public static void main(String[] args) {
	
		double[] numbersArray1 = {2, 4, 6, 8, 10};
		double[] numbersArray2 = {3, 6, 9, 12, 15};
		double[] numbersArray3 = {4, 8, 12, 16, 20};

		double total1 = sumWithForLoop(numbersArray1);
		double total2 = sumWithWhileLoop(numbersArray2);
		double total3 = sumWithDoWhileLoop(numbersArray3);

		System.out.printf("The sum of elements in the array using a while loop is %.2f%n", total1);
		System.out.printf("The sum of elements in the array using a for loop is %.2f%n", total2);
		System.out.printf("The sum of elements in the array using a do-while loop is %.2f%n", total3);

	}

	public static double sumWithForLoop(double[] numbersArray) {

		double total = 0;

		for(int count = 0; count < numbersArray.length; count ++) {
			total = total + numbersArray[count];
		}

		return total;	
			
	}

	public static double sumWithWhileLoop(double[] numbersArray) {
	
		double total = 0;
		int count = 0;
		int index = 0;

		while(count < numbersArray.length) {
			total = total + numbersArray[index];
			index = index + 1;
			count = count + 1;
		}
	
		return total;	
	
	}

	public static double sumWithDoWhileLoop(double[] numbersArray) {
		
		double total = 0;
		int count = 0;
		int index = 0;
	
		do {
		total = total + numbersArray[index];
		index = index + 1;
		count = count + 1;
				
		} while(count < numbersArray.length);
		
		return total;
	}

}