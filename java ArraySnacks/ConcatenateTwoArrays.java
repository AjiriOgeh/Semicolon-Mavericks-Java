import java.util.Arrays;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {
	
		int[] arrayOfIntegers = {1, 2, 3, 4};
		String[] arrayOfStrings = {"Apples", "Bananas", "Cherrys", "Dates"};
		String[] newArray1 = concatenateIntegerStringArrays(arrayOfIntegers, arrayOfStrings);

		System.out.printf("The arrays concatenated together: %s%n", Arrays.toString(newArray1));

	}

	public static String[] concatenateIntegerStringArrays(int[] arrayOfIntegers, String[] arrayOfStrings) {

		String[] newArray = new String[arrayOfIntegers.length + arrayOfStrings.length];
		
		int arrayOfIntegersIndex = 0;
		int newArrayIndex = 0;
	
		for(int count1 = 0; count1 < arrayOfIntegers.length; count1++) {
		
			newArray[newArrayIndex]= String.valueOf(arrayOfIntegers[arrayOfIntegersIndex]);
			
			arrayOfIntegersIndex++;
			newArrayIndex++;
		
		}

		int arrayOfStringsIndex = 0;
		int nextIndexOfNewArray = arrayOfIntegers.length;
		
		for(int count2= 0; count2 < arrayOfStrings.length; count2++){

			newArray[nextIndexOfNewArray] = arrayOfStrings[arrayOfStringsIndex];
		
			nextIndexOfNewArray++;
			arrayOfStringsIndex++;
			
		}
	
		return newArray;
	
	}

}