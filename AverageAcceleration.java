import java.util.Scanner;

public class AverageAcceleration {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter starting Velocity in m/s: ");
float velocity1 = input.nextFloat();

System.out.print("Enter ending Velocity in m/s: ");
float velocity2 = input.nextFloat();

System.out.print("Enter time in s: ");
float time = input.nextFloat();

double acceleration = (velocity2 - velocity1) / time;

System.out.printf("The average acceleration is %.3f%n", acceleration);

}

}