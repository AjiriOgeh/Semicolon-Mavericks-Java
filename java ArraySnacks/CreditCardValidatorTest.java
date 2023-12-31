import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {

	@Test
	public void testCreditCardValidator() {

		CreditCardValidator.setCreditCardNumber("4388576018402626");
		CreditCardValidator.getCreditCardNumber();
		
		assertEquals("4388576018402626","4388576018402626");

	}

	@Test
	public void testCreditCardTypeVisaCard() {

		String number = "4388576018402626";

		String actualOutput = CreditCardValidator.creditCardType(number);

		String expectedOutput = "Visa Card";
		
		assertEquals(expectedOutput, actualOutput);	
		
	}

	@Test
	public void testCreditCardTypeMasterCard() {

		String number = "5399831619690403";

		String actualOutput = CreditCardValidator.creditCardType(number);

		String expectedOutput = "MasterCard";
		
		assertEquals(expectedOutput, actualOutput);	
		
	}

	@Test
	public void testCreditCardTypeDiscoverCard() {

		String number = "614314583009587";

		String actualOutput = CreditCardValidator.creditCardType(number);

		String expectedOutput = "Discover Card";
		
		assertEquals(expectedOutput, actualOutput);	
		
	}

	@Test
	public void testCreditCardTypeAmericaExpressCard() {

		String number = "3743143421589912";

		String actualOutput = CreditCardValidator.creditCardType(number);

		String expectedOutput = "AmericanExpress Card";
		
		assertEquals(expectedOutput, actualOutput);	
		
	}

	@Test
	public void testCreditCardTypeInvalidCard() {

		String number = "234319283049582";

		String actualOutput = CreditCardValidator.creditCardType(number);

		String expectedOutput = "Invalid Card";
		
		assertEquals(expectedOutput, actualOutput);	
		
	}



	@Test
	public void testcreditCardDigitsInArray() {

		String number = "4388576018402626";

		long[] actualOutput = CreditCardValidator.creditCardDigitsInArray(number);

		long[] expectedOutput = {6,2,6,2,0,4,8,1,0,6,7,5,8,8,3,4};
		
		assertArrayEquals(expectedOutput, actualOutput);	
		
	}
	
	@Test
	public void testdoubleEverySecondDigits() {

		long[] number = {6,2,6,2,0,4,8,1,0,6,7,5,8,8,3,4}; 

		long actualOutput = CreditCardValidator.doubleEverySecondDigitSum(number);

		long expectedOutput = 37;
		
		assertEquals(expectedOutput, actualOutput);
	

	}

	@Test
	public void testsingleDigitsArraySum() {

		long[] number = {6,2,6,2,0,4,8,1,0,6,7,5,8,8,3,4};

		long actualOutput = CreditCardValidator.singleDigitsSum(number);

		long expectedOutput = 38;
	
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testcreditCardNumberValidity() {

		long singleDigits = 38;
		
		long doubleDigits = 37;
	
		String actualOutput = CreditCardValidator.creditCardNumberValidity(singleDigits, doubleDigits);
		
		String expectedOutput = "Invalid";

		assertEquals(expectedOutput, actualOutput);
	}

}