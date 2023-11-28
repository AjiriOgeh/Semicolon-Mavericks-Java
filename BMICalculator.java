import java.util.Scanner;

public class BMICalculator {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Weight in kilograms: ");
int weight = input.nextInt();

System.out.print("Enter Height in meters: ");
float height = input.nextFloat();

double bmi = weight / (height * height);

System.out.printf("BMI is %.2f%n%n", bmi);

System.out.println("BMI Categories");
System.out.println("Underweight = <18.5");
System.out.println("Normal weight = 18.5-24.9");
System.out.println("Overweight = 25-29.9");
System.out.println("Obesity = BMI of 30 or greater");

}

}