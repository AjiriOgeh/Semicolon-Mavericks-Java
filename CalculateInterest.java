import java.util.Scanner;

public class CalculateInterest {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter Balance: ");
float balance = sc.nextFloat();

System.out.print("Enter Annual Interest Rate: ");
float annualInterestRate = sc.nextFloat();

double interest = balance * (annualInterestRate / 1200);

System.out.printf("The Interest is %.5f%n", interest);

}

}