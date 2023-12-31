import java.util.Arrays;

public class CombineTwoArraysAlternatively {

	public static void main(String[] args) {
	
		int[] arrayOfIntegers = {1, 2, 3, 4};
		String[] arrayOfStrings = {"Apples", "Bananas", "Cherrys", "Dates"};
		String[] newArray1 = combineIntegerAndStringArraysAlternatively(arrayOfIntegers, arrayOfStrings);

		System.out.printf("The arrays combined alternatively: %s%n", Arrays.toString(newArray1));
		
	}

	public static String[] combineIntegerAndStringArraysAlternatively(int[] arrayOfIntegers, String[] arrayOfStrings) {

		int newArrayLength = arrayOfIntegers.length + arrayOfStrings.length;
		String[] newArray = new String[newArrayLength];
		
		int newArrayEvenIndex = 0;
		int newArrayOddIndex = 1;
		int arrayOfIntegersIndex = 0;
		int arrayOfStringsIndex = 0;
				
		for(int count = 0; count < newArrayLength / 2; count+=1) {
		
			newArray[newArrayEvenIndex] = String.valueOf(arrayOfIntegers[arrayOfIntegersIndex]);
			newArray[newArrayOddIndex] = arrayOfStrings[arrayOfStringsIndex];
	
			newArrayEvenIndex += 2;
			arrayOfIntegersIndex += 1;

			newArrayOddIndex += 2;
			arrayOfStringsIndex += 1;

		}
		
		return newArray;
	
	}

}