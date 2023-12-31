import java.util.Arrays;

public class EvenPosition {

	public static void main(String[] args){
		
		int[] arrayOfIntegers = {0, 1, 2, 3, 4, 5, 6};
		int[] newArrayOfIntegers = evenPositionIntegers(arrayOfIntegers);

		String[] arrayOfStrings = {"Apple", "Banana", "Cherry", "Date", "Eggplant", "Guava"};
		String[] newArrayOfStrings = evenPositionStrings(arrayOfStrings);

		char[] arrayOfCharacters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		char[] newArrayOfCharacters = evenPositionCharacters(arrayOfCharacters);
		
		boolean[] arrayOfBooleans = {true, false, true, false, true, false, true, false};
		boolean[] newArrayOfBooleans = evenPositionBooleans(arrayOfBooleans);

		System.out.printf("The elements in even positions of the array: %s%n", Arrays.toString(newArrayOfIntegers));
		System.out.printf("The elements in even positions of the array: %s%n", Arrays.toString(newArrayOfStrings));
		System.out.printf("The elements in even positions of the array: %s%n", Arrays.toString(newArrayOfCharacters));
		System.out.printf("The elements in even positions of the array: %s%n", Arrays.toString(newArrayOfBooleans));
			
	}

	public static int[] evenPositionIntegers(int[] arrayOfIntegers) {
	
		int[] newArray = new int[(arrayOfIntegers.length + 1) / 2];

		int newArrayIndex = 0;
		int arrayOfIntegersIndex = 0; 
	
		for(int count = 0; count < arrayOfIntegers.length; count++) {
		
			if(arrayOfIntegersIndex % 2 == 0) {

				newArray[newArrayIndex] = arrayOfIntegers[arrayOfIntegersIndex];

				newArrayIndex += 1;
			}
	
			arrayOfIntegersIndex += 1;
		}

		return newArray;

	}

	public static String[] evenPositionStrings(String[] arrayOfStrings) {
	
		String[] newArray = new String[(arrayOfStrings.length + 1) / 2];
		
		int newArrayIndex = 0;
		int arrayOfStringsIndex = 0;

		for(int count = 0; count < arrayOfStrings.length; count++) {
		
			if(arrayOfStringsIndex % 2 == 0) {

				newArray[newArrayIndex] = arrayOfStrings[arrayOfStringsIndex];

				newArrayIndex += 1;
			}
		
			arrayOfStringsIndex += 1;			

		}

		return newArray;
	}

	public static char[] evenPositionCharacters(char[] arrayOfCharacters) {
	
		char newArray[] = new char[(arrayOfCharacters.length + 1) / 2];

		int newArrayIndex = 0;
		int arrayOfCharactersIndex = 0;
		
		for (int count = 0; count < arrayOfCharacters.length; count++) {

			if (arrayOfCharactersIndex % 2 == 0) {

				newArray[newArrayIndex] = arrayOfCharacters[arrayOfCharactersIndex];
				
				newArrayIndex++;
			}

			arrayOfCharactersIndex++;
			
		}
		
		return newArray;
	}

	public static boolean[] evenPositionBooleans(boolean[] arrayOfBooleans) {
	
		boolean newArray[] = new boolean[(arrayOfBooleans.length + 1) / 2];

		int newArrayIndex = 0;
		int arrayOfBooleansIndex = 0;
		
		for (int count = 0; count < arrayOfBooleans.length; count++) {

			if (arrayOfBooleansIndex % 2 == 0) {

				newArray[newArrayIndex] = arrayOfBooleans[arrayOfBooleansIndex];
				
				newArrayIndex++;
			}

			arrayOfBooleansIndex++;
			
		}
		
		return newArray;
	}

}