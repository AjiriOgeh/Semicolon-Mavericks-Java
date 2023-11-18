import java.util.Scanner;

public class SquareComparedWith100 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter integer: ");
int number = input.nextInt();

int squareOfNumber = (number * number);

if (number == 100) {
System.out.printf("%d is equal to 100\n", number);
}

if (number < 100) { 
System.out.printf("%d is less than 100\n", number);
}

if (number > 100) {
System.out.printf("%d is greater than 100\n", number);
}


if (squareOfNumber == 100) {
System.out.printf("%d (square of %d) is equal to 100", squareOfNumber, number);
}

if (squareOfNumber < 100) { 
System.out.printf("%d (square of %d) is less than 100", squareOfNumber, number);
}

if (squareOfNumber > 100) {
System.out.printf("%d (square of %d) is greater than 100", squareOfNumber, number);
}

}

}