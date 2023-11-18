import java.util.Scanner;

public class BodyMassIndex {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
float poundsWeight = sc.nextFloat();

System.out.print("Enter height in inches: ");
float inchesHeight = sc.nextFloat();

double bmi = (poundsWeight * 0.45359237) / ((inchesHeight * 0.0254) * (inchesHeight * 0.0254));

System.out.printf("BMI is %.3f%n", bmi);

}

}