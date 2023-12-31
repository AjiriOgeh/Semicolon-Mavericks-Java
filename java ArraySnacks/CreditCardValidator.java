public class CreditCardValidator {

	private static String creditCardNumber;

		public static void setCreditCardNumber(String creditCardNumber) {
			CreditCardValidator.creditCardNumber = creditCardNumber;
			
		}

		public static String getCreditCardNumber(){

			return creditCardNumber;
		}

		public static String creditCardType(String creditCardNumber) {
	
			long creditCardDigits = Long.parseLong(creditCardNumber);

			long[] creditCardArray = new long[creditCardNumber.length()];

			int creditCardArrayIndex = creditCardNumber.length() - 1;

			for(int count = 0; count < creditCardNumber.length(); count++) {

				creditCardArray[creditCardArrayIndex] = creditCardDigits % 10;
				
				creditCardDigits = creditCardDigits / 10;
				
				creditCardArrayIndex--;
		
			}
			
			String creditCardTypeValidityStatus = "Unverified";

			for(int count2 = 0; count2 < creditCardNumber.length(); count2++) {

				if(creditCardArray[0] == 4) {
					
					creditCardTypeValidityStatus = "Visa Card";

				}

				else if(creditCardArray[0] == 5) {

					creditCardTypeValidityStatus = "MasterCard";

				}

				else if(creditCardArray[0] == 6) {

					creditCardTypeValidityStatus = "Discover Card";

				}

				else if((creditCardArray[0] == 3) && (creditCardArray[1] == 7)) {

					creditCardTypeValidityStatus = "AmericanExpress Card";

				}

				else {

					creditCardTypeValidityStatus = "Invalid Card";
				}
		
			}

			return creditCardTypeValidityStatus;

		}

		public static long[] creditCardDigitsInArray(String creditCardNumber) {

			long creditCardDigits = Long.parseLong(creditCardNumber);

			long[] creditCardArray = new long[creditCardNumber.length()];

			int creditCardArrayIndex = 0;

			for(int count = 0; count < creditCardNumber.length(); count++) {

				creditCardArray[creditCardArrayIndex] = creditCardDigits % 10;

				creditCardDigits = creditCardDigits / 10;
				
				creditCardArrayIndex++;

			}

			return creditCardArray;

		}

		public static long doubleEverySecondDigitSum(long[] creditCardArray) {

			long[] secondDigitsArray = new long[creditCardArray.length / 2];
		
			int creditCardArrayIndex = 0;
			int secondDigitsArrayIndex = 0;
										
			for(int count = 0; count < creditCardArray.length; count++){
			
				if(creditCardArrayIndex % 2 != 0) {
					
					secondDigitsArray[secondDigitsArrayIndex] = creditCardArray[creditCardArrayIndex] * 2;
					
					secondDigitsArrayIndex++;
				}

				creditCardArrayIndex++;

			}

			long total = 0;
				
			for(int count2 = 0; count2 < secondDigitsArray.length; count2++) {	
		
				if(secondDigitsArray[count2] > 9) {

					long firstDigit = secondDigitsArray[count2] / 10;
					long secondDigit = secondDigitsArray[count2] % 10;

					total += firstDigit + secondDigit;
				}
				
				else {
					total += secondDigitsArray[count2];

				}
	
			}

			return total;
		}

		public static long singleDigitsSum(long[] creditCardArray) {

			long[] singleDigitsArray = new long[(creditCardArray.length + 1) / 2];

			int singleDigitsArrayIndex = 0;
			int creditCardArrayIndex = 0;

			for(int count = 0; count < creditCardArray.length; count++){
				
				if(creditCardArrayIndex % 2 == 0) {

					singleDigitsArray[singleDigitsArrayIndex] = creditCardArray[creditCardArrayIndex];

					singleDigitsArrayIndex++;
				
				}

				creditCardArrayIndex++;
				
			}

			long total = 0;
		
			for(int count2 = 0; count2 < singleDigitsArray.length; count2++) {
				
					total += singleDigitsArray[count2];

				}
			
			return total;

		}

		public static String creditCardNumberValidity(long singleDigitsSum, long doubleDigitsSum) {

			long total = singleDigitsSum + doubleDigitsSum;

			String validityStatus = "Unverified";

			if(total % 10 == 0){

				validityStatus = "Valid";
			} 

			else {
				validityStatus = "Invalid";
			}		
		
			return validityStatus;
		}

}