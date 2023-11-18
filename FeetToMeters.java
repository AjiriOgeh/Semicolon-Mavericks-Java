import java.util.Scanner;

public class FeetToMeters {

public static void main(String[] args) {

Scanner takeInput = new Scanner(System.in);

System.out.print("Enter number in feet: ");
float feet = takeInput.nextFloat();

double meters = feet * 0.305;

System.out.printf("%.1f is %.3f meters", feet, meters);

}

}