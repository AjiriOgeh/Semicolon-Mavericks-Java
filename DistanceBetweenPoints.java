import java.util.Scanner;

public class DistanceBetweenPoints {

	public static void main(String [] args) {
	
	Scanner inputDecoder = new Scanner(System.in);

		System.out.print("Enter the value of x1: ");
		double x1 = inputDecoder.nextInt();

		System.out.print("Enter the value of y1: ");
		double y1 = inputDecoder.nextInt();

		System.out.print("Enter the value of x2: ");
		double x2 = inputDecoder.nextInt();
	
		System.out.print("Enter the value of y2: ");
		double y2 = inputDecoder.nextInt();
				
		double gradient = (y2 - y1) / (x2 - x1);

		if (gradient == 0) {
		System.out.print("The points are located on perpendicular line");
		}
		else{
		System.out.print("The points are not located on a perpendicular line");
		}

	}


}