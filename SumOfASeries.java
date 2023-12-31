public class SumOfASeries{

	public static void main(String[] args){

	System.out.println("Number\tCorresponding Sum");

	long numberSum = 0;

		for (long number = 1; number<= 100; number++){

		numberSum = number + numberSum;
		System.out.printf("%d\t%d%n", number, numberSum);

		}
	}

}