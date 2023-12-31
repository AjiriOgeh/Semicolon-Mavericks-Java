import java.util.Arrays;

public class OddPosition {

	public static void main(String[] args) {
	
		int[] arrayOfIntegers = {0, 1, 2, 3, 4, 5};
		int[] newArrayOfIntegers = oddPositionIntegers(arrayOfIntegers);

		String[] arrayOfStrings = {"Ant", "Bear", "Cat", "Dog", "Elephant", "Fish", "Giraffe"};
		String[] newArrayOfStrings = oddPositionStrings(arrayOfStrings);

		char[] arrayOfCharacters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		char[] newArrayOfCharacters = oddPositionCharacters(arrayOfCharacters);
		
		boolean[] arrayOfBooleans = {true, false, true, false, true, false, true, false};
		boolean[] newArrayOfBooleans = oddPositionBooleans(arrayOfBooleans);

		System.out.printf("The elements in odd positions of the array: %s%n", Arrays.toString(newArrayOfIntegers));
		System.out.printf("The elements in odd positions of the array: %s%n", Arrays.toString(newArrayOfStrings));
		System.out.printf("The elements in odd positions of the array: %s%n", Arrays.toString(newArrayOfCharacters));
		System.out.printf("The elements in odd positions of the array: %s%n", Arrays.toString(newArrayOfBooleans));	
	}

	public static int[] oddPositionIntegers(int[] arrayOfIntegers) {
	
		int[] newArray = new int[arrayOfIntegers.length / 2];

		int newArrayIndex = 0;
		int arrayOfIntegersIndex = 0;
	
		for(int count = 0; count < arrayOfIntegers.length; count++) {

			if (arrayOfIntegersIndex % 2 != 0) {

				newArray[newArrayIndex] = arrayOfIntegers[arrayOfIntegersIndex];

				newArrayIndex++;
			}
			
			arrayOfIntegersIndex++;	
		}
	
		return newArray;

	}

	public static String[] oddPositionStrings(String[] arrayOfStrings) {
	
		String newArray[] = new String[arrayOfStrings.length / 2];

		int newArrayIndex = 0;
		int arrayOfStringsIndex = 0;
	
		for(int count = 0; count < arrayOfStrings.length; count++) {

			if (arrayOfStringsIndex % 2 != 0) {

				newArray[newArrayIndex] = arrayOfStrings[arrayOfStringsIndex];

				newArrayIndex++;
			}

			arrayOfStringsIndex++;
			
		}
	
		return newArray;

	}

	public static char[] oddPositionCharacters(char[] arrayOfCharacters) {
	
		char newArray[] = new char[arrayOfCharacters.length / 2];

		int newArrayIndex = 0;
		int arrayOfCharactersIndex = 0;
		
		for (int count = 0; count < arrayOfCharacters.length; count++) {

			if (arrayOfCharactersIndex % 2 != 0) {

				newArray[newArrayIndex] = arrayOfCharacters[arrayOfCharactersIndex];
				
				newArrayIndex++;
			}

			arrayOfCharactersIndex++;
			
		}
		
		return newArray;
	}

	public static boolean[] oddPositionBooleans(boolean[] arrayOfBooleans) {
	
		boolean newArray[] = new boolean[arrayOfBooleans.length / 2];

		int newArrayIndex = 0;
		int arrayOfBooleansIndex = 0;
		
		for (int count = 0; count < arrayOfBooleans.length; count++) {

			if (arrayOfBooleansIndex % 2 != 0) {

				newArray[newArrayIndex] = arrayOfBooleans[arrayOfBooleansIndex];
				
				newArrayIndex++;
			}

			arrayOfBooleansIndex++;
			
		}
		
		return newArray;
	}

}