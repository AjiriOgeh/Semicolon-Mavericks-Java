import java.util.Arrays;

public class LargestElement{

	public static void main(String[] args) {

		double[] numbersArray1 = {3, -5.5, 5000, -45, -250, 0.25, 750, -35.75};
		double largestElement1 = largestElementInArray(numbersArray1);

		double[] numbersArray2 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		double largestElement2 = largestElementInArray(numbersArray2);
	
		System.out.printf("The largest element in the array is %.2f%n", largestElement1);
		System.out.printf("The largest element in the array is %.2f%n", largestElement2);
	}

	public static double largestElementInArray(double[] numbersArray) {

		double largestElement = numbersArray[0];
		
			for(int count = 0; count < numbersArray.length; count++) {

				if(numbersArray[count] > largestElement) {

					largestElement = numbersArray[count];
			}
	
		}

		return largestElement;

	}

}