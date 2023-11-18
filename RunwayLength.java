import java.util.Scanner;

public class RunwayLength {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Velocity in m/s: ");
float velocity = input.nextFloat();

System.out.print("Enter Acceleration in m/s square: ");
float acceleration = input.nextFloat();

double length = (velocity * velocity) / (2 * acceleration);

System.out.printf("The Runway Length of the airplane is %.4f", length);

}

}