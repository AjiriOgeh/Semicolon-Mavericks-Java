import java.util.Scanner;

public class IntegersInNonDecreasingOrder {

public static void main(String[] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int number1 = inputCollector.nextInt();

System.out.print("Enter the Second integer: ");
int number2 = inputCollector.nextInt();

System.out.print("Enter the third integer: ");
int number3 = inputCollector.nextInt();

if ((number1 > number2) && (number1 > number3)) {
if (number2 > number3)
System.out.printf("In Non-decreasing order is %d, %d, %d", number3, number2, number1);
}

if ((number1 > number2) && (number1 > number3)) {
if (number3 > number2)
System.out.printf("In Non-decreasing order is %d, %d, %d", number2, number3, number1);
}


if ((number2 > number1) && (number2 > number3)) {
if (number1 > number3)
System.out.printf("In Non-decreasing order is %d, %d, %d", number3, number1, number2);
}

if ((number2 > number1) && (number2 > number3)) {
if (number3 > number1)
System.out.printf("In Non-decreasing order is %d, %d, %d", number1, number3, number2);
}


if ((number3 > number1) && (number3 > number1)) {
if (number1 > number2)
System.out.printf("In Non-decreasing order is %d, %d, %d", number2, number1, number3);
}

if ((number3 > number1) && (number3 > number1)) {
if (number2 > number1)
System.out.printf("In Non-decreasing order is %d, %d, %d", number1, number2, number3);
}

}

}