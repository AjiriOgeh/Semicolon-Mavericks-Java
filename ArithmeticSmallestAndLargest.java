import java.util.Scanner;

public class ArithmeticSmallestAndLargest {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter First integer: ");
int number1 = input.nextInt();

System.out.print("Enter Second integer: ");
int number2 = input.nextInt();

System.out.print("Enter Third integer: ");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
int product = number1 * number2 * number3;
int average = (number1 + number2 + number3) / 3;

System.out.printf("The sum of the integers is %d%n", sum);
System.out.printf("The product of the integers is %d%n", product);
System.out.printf("The average of the integers is %d%n", average);

if ((number1 < number2) && (number1 < number3)) { 
System.out.printf("%d is the smallest number\n", number1);
}

if ((number2 < number1) & (number2 < number3)) { 
System.out.printf("%d is the smallest number\n", number2);
}

if ((number3 < number1) && (number3 < number2)) { 
System.out.printf("%d is the smallest number\n", number3);
}

if ((number1 > number2) && (number1 > number3)) { 
System.out.printf("%d is the largest number", number1);
}

if ((number2 > number1) && (number2 > number3)) { 
System.out.printf("%d is the largest number", number2);
}

if ((number3 > number1) && (number3 > number2)) { 
System.out.printf("%d is the largest number", number3);
}

}

}