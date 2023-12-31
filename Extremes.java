import java.util.Scanner;

public class Extremes {

	public static void main(String [] args){

	Scanner numberCollector = new Scanner(System.in);
		
	System.out.print("Enter the number of integers you want to input: ");
	int numberOfInput = numberCollector.nextInt();


	System.out.print("Enter an integer: ");
	int number = numberCollector.nextInt();	

	int maximumNumber = number;

	int minimumNumber = number;

	int count = 0;

	while(count <= numberOfInput){

		
		if (number <= minimumNumber) {
		minimumNumber = number;
		}
		
		if (number >= maximumNumber){
		maximumNumber = number;
		}

		count = count + 1;

		if (count == numberOfInput) 
		break;

		System.out.print("Enter an integer: ");
		number = numberCollector.nextInt();	
	}
	


	int total = maximumNumber + minimumNumber;

	System.out.printf("The total of the minimum and maximum value is %d%n", total);

	System.out.printf("The maximum value is %d%n",maximumNumber);
	System.out.printf("The minimum value is %d%n",minimumNumber);


	}


}