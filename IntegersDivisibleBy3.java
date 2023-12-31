public class IntegersDivisibleBy3 {

	public static void main(String [] args){

		int total = 0;

		for(int number = 1; number <= 30; number++ ) {
		
		if (number % 3 == 0)
		total = number + total;
				
		}

	System.out.printf("The sum of all the integers between 1 and 30 that are divisible by 3 is %d",total);
	}

}