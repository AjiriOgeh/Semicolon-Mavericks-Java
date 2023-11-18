import java.util.Scanner;

public class SeperateDigits {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number consisting of five digits: ");
int number = scanner.nextInt();

int digit5 = number % 10;
int quotient1 = number / 10;

int digit4 = quotient1 % 10;
int quotient2 = quotient1 / 10;

int digit3 = quotient2 % 10;
int quotient3 = quotient2 / 10;

int digit2 = quotient3 % 10;
int quotient4 = quotient3 / 10;

int digit1 = quotient4 % 10;
int quotient5 = quotient4 / 10;

System.out.printf("%d   %d   %d   %d   %d", digit1 , digit2, digit3, digit4, digit5);

}

}