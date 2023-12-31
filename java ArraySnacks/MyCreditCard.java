import java.util.Scanner;

public class MyCreditCard {

	public static void main(String[] args) {

		Scanner numberDecoder = new Scanner(System.in);

		System.out.println("Hello, Kindly Enter Card details to verify");

		String creditCardNumber = numberDecoder.nextLine();

		while((creditCardNumber.length() < 13) || (creditCardNumber.length() > 16)) {

			System.out.println("Hello, Kindly Enter Card details to verify");

			creditCardNumber = numberDecoder.nextLine();

		}

		CreditCardValidator.setCreditCardNumber(creditCardNumber);
						
		String creditCardType = CreditCardValidator.creditCardType(creditCardNumber);

		long[] calculationArray = CreditCardValidator.creditCardDigitsInArray(creditCardNumber);

		long doubleDigitsTotal = CreditCardValidator.doubleEverySecondDigitSum(calculationArray);

		long singleDigitsSum = CreditCardValidator.singleDigitsSum(calculationArray);
		
		String numberValidity = CreditCardValidator.creditCardNumberValidity(singleDigitsSum, doubleDigitsTotal);

		System.out.printf("**Credit Card Type: %s%n", creditCardType);
		System.out.printf("**Credit Card Number: %s%n", CreditCardValidator.getCreditCardNumber());
		System.out.printf("**Credit Card Digit Length: %d%n", creditCardNumber.length());
		System.out.printf("**Credit Card Validity Status: %s%n", numberValidity);
		System.out.printf("*****************************************");

	}

}