import java.util.Scanner;

public class DrivingCost {

public static void main(String[] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter distance to drive: ");
float drivingDistance = inputCollector.nextFloat();

System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
float milesPerGallon = inputCollector.nextFloat();

System.out.print("Enter the price per gallon: $");
float pricePerGallon = inputCollector.nextFloat();

double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;

System.out.printf("The cost of driving is $%.3f%n", costOfDriving);

}

}