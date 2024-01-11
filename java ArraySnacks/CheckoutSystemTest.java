import java.util.Arrays;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutSystemTest {

	@Test
	public void testSetAndGetCustomerName(){
	
		CheckoutSystem customerCheckout = new CheckoutSystem();

		customerCheckout.setCustomerName("John Doe");

		String expectedOutput = "John Doe";

		String actualOutput = customerCheckout.getCustomerName();	

		assertEquals(expectedOutput, actualOutput);	
		
	}
	
	@Test
	public void testGetDateAndTime() {

		CheckoutSystem customerCheckout = new CheckoutSystem();

		String expectedOutput = customerCheckout.getDateAndTime();

		String actualOutput = customerCheckout.getDateAndTime();

		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testSetAndGetDiscount() {

		CheckoutSystem customerCheckout = new CheckoutSystem();	
		
		customerCheckout.setDiscount(17.5);

		double expectedOutput = 17.5;

		double actualOutput = customerCheckout.getDiscount();

		assertEquals(expectedOutput, actualOutput);

	}
		
	@Test
	public void testGetSubTotal() {

		CheckoutSystem customerCheckout = new CheckoutSystem();

		ArrayList<Integer> numberOfPiecesList = new ArrayList<>(Arrays.asList(2, 2));

		ArrayList<Double> pricePerUnitList = new ArrayList<>(Arrays.asList(2100.0, 550.0));

		double expectedOutput = 5300;

		double actualOutput = customerCheckout.getSubTotal(numberOfPiecesList, pricePerUnitList);

		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testGetDiscountedPrice() {

		CheckoutSystem customerCheckout = new CheckoutSystem();

		customerCheckout.setDiscount(17.5);

		double discount = customerCheckout.getDiscount();

		double expectedOutput = 927.5;

		double actualOutput = customerCheckout.getDiscountedPrice(5300);
		
		double delta = 0.00001;

		assertEquals(expectedOutput, actualOutput, delta);
	}

	@Test
	public void testSetAndGetCashierName() {

		CheckoutSystem customerCheckout = new CheckoutSystem();

		customerCheckout.setCashierName("Jane Doe");

		String expectedOutput = "Jane Doe";

		String actualOutput = customerCheckout.getCashierName();

		assertEquals(expectedOutput, actualOutput);
		
	}

	@Test
	public void testGetValueAddedTax() {

		CheckoutSystem customerCheckout = new CheckoutSystem();

		double subTotal = 5300; 

		double expectedOutput = 927.50;

		double actualOutput = customerCheckout.getValueAddedTax(subTotal);
		
		double delta = 0.00001;

		assertEquals(expectedOutput, actualOutput, delta);

	}

	@Test
	public void testGetBillTotal() {
	
		CheckoutSystem customerCheckout = new CheckoutSystem();

		double subTotal = 5300.0;

		double valueAddedTax = 927.50;

		double discountedPrice = 424.0;

		double expectedOutput = 5803.50;

		double actualOutput = customerCheckout.getBillTotal(subTotal, discountedPrice, valueAddedTax );

		double delta = 0.00001;

		assertEquals(expectedOutput, actualOutput, delta);
	
	}

	@Test
	public void testSetAndGetCustomerPayment() {
	
		CheckoutSystem customerCheckout = new CheckoutSystem();

		customerCheckout.setCustomerPayment(6000);

		double expectedOutput = 6000;
		
		double actualOutput = customerCheckout.getCustomerPayment();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testGetBalnce() {

		CheckoutSystem customerCheckout = new CheckoutSystem();

		customerCheckout.setCustomerPayment(6000);

		double customerPayment = customerCheckout.getCustomerPayment();
		
		double billTotal = 5803.5;

		double expectedOutput = 196.5;

		double actualOutput = customerCheckout.getBalance(billTotal);

		assertEquals(expectedOutput, actualOutput);

	}	

}