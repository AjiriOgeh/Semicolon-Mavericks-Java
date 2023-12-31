import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args){
	
	int[] arrayOfIntegers = {1, 2, 3, 4, 5};
	int[] newArrayOfIntegers = reverseIntegerArray(arrayOfIntegers);

	double[] arrayOfDoubles = {0.15, 0.25, 0.35, 0.45, 0.55, 0.65};
	double[] newArrayOfDoubles = reverseDoubleArray(arrayOfDoubles);

	String[] arrayOfStrings = {"Argentina", "Brazil", "Canada", "Denmark", "Egypt", "France", "Ghana"};
	String[] newArrayOfStrings = reverseStringArray(arrayOfStrings);
	
	char[] arrayOfCharacters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	char[] newArrayOfCharacters = reverseCharacterArray(arrayOfCharacters);

	System.out.printf("The array of integers in reverse order is: %s%n", Arrays.toString(newArrayOfIntegers));
	System.out.printf("The array of doubles in reverse order is: %s%n", Arrays.toString(newArrayOfDoubles));
	System.out.printf("The array of strings in reverse order is: %s%n", Arrays.toString(newArrayOfStrings));
	System.out.printf("The array of characters in reverse order is: %s%n", Arrays.toString(newArrayOfCharacters));
	
	}

	public static int[] reverseIntegerArray(int[] arrayOfIntegers) {
		
		int[] newArray = new int[arrayOfIntegers.length];
		
		int arrayOfIntegersIndex = arrayOfIntegers.length -1;
		int newArrayIndex = 0;	

		for(int count = 0; count < arrayOfIntegers.length; count++) {
				
			newArray[newArrayIndex] = arrayOfIntegers[arrayOfIntegersIndex];
			
			newArrayIndex += 1;
			arrayOfIntegersIndex -= 1;
				
		}
	
		return newArray;
	}

	public static double[] reverseDoubleArray(double[] arrayOfDoubles) {

		double[] newArray = new double[arrayOfDoubles.length];
		
		int arrayOfDoublesIndex = arrayOfDoubles.length -1;
		int newArrayIndex = 0;

		for(int count = 0; count < arrayOfDoubles.length; count++) {

			newArray[newArrayIndex] = arrayOfDoubles[arrayOfDoublesIndex];
			
			newArrayIndex += 1;
			arrayOfDoublesIndex -= 1;
		}

		return newArray;
	}

	public static String[] reverseStringArray(String[] arrayOfStrings) {
		
		String[] newArray = new String[arrayOfStrings.length];
		
		int arrayOfStringsIndex = arrayOfStrings.length - 1;
		int newArrayIndex = 0;

		for(int count = 0; count < arrayOfStrings.length; count++) {
		
			newArray[newArrayIndex] = arrayOfStrings[arrayOfStringsIndex];
			
			newArrayIndex += 1;
			arrayOfStringsIndex -= 1;
		
		}

		return newArray;

	}

	public static char[] reverseCharacterArray(char[] arrayOfCharacters) {
		
		char[] newArray = new char[arrayOfCharacters.length];

		int arrayOfCharactersIndex = arrayOfCharacters.length - 1;
		int newArrayIndex = 0;	
		
		for(int count = 0; count < arrayOfCharacters.length; count++) {
			newArray[newArrayIndex] = arrayOfCharacters[arrayOfCharactersIndex];
		
			newArrayIndex += 1;
			arrayOfCharactersIndex -= 1;
		
		}
	
		return newArray;
	
	}

}