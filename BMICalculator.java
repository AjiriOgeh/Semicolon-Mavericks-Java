import java.util.Scanner;

public class BMICalculator {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Weight in kilograms: ");
int weight = input.nextInt();

System.out.print("Enter Height in meters: ");
float height = input.nextFloat();

double bmi = weight / (height * height);

System.out.printf("BMI is %.2f%n", bmi);

}

}