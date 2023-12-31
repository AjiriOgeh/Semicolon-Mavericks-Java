import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {

	Scanner inputCollector = new Scanner(System.in);

		int largestNumber = 0;

		int number = 0;

		int counter = 1;

		while(counter <= 10){

			System.out.print("Enter a number: ");
			number = inputCollector.nextInt();

			counter = counter + 1;

			if (number > largestNumber){
			largestNumber = number;
			}

		}
	System.out.println("The last input was "+number);
	System.out.println("The largest number is "+largestNumber);

	}

}








































/*System.out.print("Enter the number of items sold");
int soldItems = inputCollector.nextInt();*/