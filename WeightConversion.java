import java.util.Scanner;

public class WeightConversion {

public static void main(String[] args) {

Scanner collector = new Scanner(System.in);

System.out.print("Enter the weight in pounds: ");
float pounds = collector.nextFloat();

double kilograms = pounds * 0.454;

System.out.printf("The weight in kilograms is %.3f%n", kilograms);

}

}