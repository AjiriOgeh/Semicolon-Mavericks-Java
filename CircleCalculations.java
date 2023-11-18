import java.util.Scanner;

public class CircleCalculations {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the radius: ");
int radius = input.nextInt();

double π = 3.145159;

System.out.printf("Diameter: %d%n", (2 * radius));

System.out.printf("Circumference: %.3f%n", (2 * π * radius));

System.out.printf("Area: %.3f%n", (π * ( radius * radius)));

}

}

