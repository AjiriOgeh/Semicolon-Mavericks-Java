import java.util.Arrays;

public class NumberToDigitsArray {

	public static void main(String[] args){

		String number = "12345";

		int[] newArray = numberToDigitsArray(number);
	
		System.out.print(Arrays.toString(newArray));

	}

	public static int[] numberToDigitsArray(String number) {
		
		int numberInInteger = Integer.parseInt(number);
		
		int[] arrayOfIntegers = new int[number.length()];

		int arrayOfIntegersIndex = number.length() - 1;

		for(int count = 0; count < number.length(); count++) {

			arrayOfIntegers[arrayOfIntegersIndex] = numberInInteger % 10;
			
			numberInInteger = numberInInteger / 10;
			
			arrayOfIntegersIndex--;

		}

		return arrayOfIntegers;

	}

}