import java.util.Scanner;

public class TripleIsAMultipleofSquare {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the First integer: ");
int number1 = input.nextInt();

System.out.print("Enter the Second integer: ");
int number2 = input.nextInt();

int cubeNumber1 = number1 * number1 * number1;
int squaredNumber2 = number2 * number2;

if ((cubeNumber1 % squaredNumber2) == 0) {
System.out.printf("%d is a multiple of %d", cubeNumber1, squaredNumber2);
}

if ((cubeNumber1 % squaredNumber2) != 0) {
System.out.printf("%d is not multiple of %d",cubeNumber1, squaredNumber2 );
}

}

}