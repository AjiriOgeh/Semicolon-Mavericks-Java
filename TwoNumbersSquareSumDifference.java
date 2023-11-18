import java.util.Scanner;

public class TwoNumbersSquareSumDifference {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int number1 = input.nextInt();

System.out.print("Enter the second integer: ");
int number2 = input.nextInt();

int squareNumber1 = number1 * number1;
int squareNumber2 = number2 * number2;

int sum = squareNumber1 + squareNumber2;
int difference = squareNumber1 - squareNumber2;

System.out.printf("The square of the First integer is %d%n", squareNumber1);
System.out.printf("The square of the Second integer is %d%n",squareNumber2);

System.out.printf("Sum of the squares of both intergers is %d%n", sum);
System.out.printf("Difference of the squares of both integers is %d%n", difference);

}

}