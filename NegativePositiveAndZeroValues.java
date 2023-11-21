import java.util.Scanner;

public class NegativePositiveAndZeroValues {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the first number: ");
int number1 = sc.nextInt();

System.out.print("Enter the second number: ");
int number2 = sc.nextInt();

System.out.print("Enter the third number: ");
int number3 = sc.nextInt();

System.out.print("Enter the fourth number: ");
int number4 = sc.nextInt();

System.out.print("Enter the fifth number: ");
int number5 = sc.nextInt();

int positiveNumber = 0;
int negativeNumber = 0;
int zeroNumber = 0;

if (number1 > 0) {
positiveNumber = positiveNumber + 1;
}

if (number1 < 0) {
negativeNumber = negativeNumber + 1;
}

if (number1 == 0) { 
zeroNumber = zeroNumber + 1;
}

if (number2 > 0) {
positiveNumber = positiveNumber + 1;
}

if (number2 < 0) {
negativeNumber = negativeNumber + 1;
}

if(number2 == 0) {
zeroNumber = zeroNumber + 1;
}

if (number3 > 0) {
positiveNumber = positiveNumber + 1;
}

if (number3 < 0) {
negativeNumber = negativeNumber + 1;
}

if(number3 == 0) {
zeroNumber = zeroNumber + 1;
}

if (number4 > 0) {
positiveNumber = positiveNumber + 1;
}

if (number4 < 0) {
negativeNumber = negativeNumber + 1;
}

if (number4 == 0) {
zeroNumber = zeroNumber + 1;
}

if (number5 > 0) {
positiveNumber = positiveNumber + 1;
}

if (number5 < 0) {
negativeNumber = negativeNumber + 1;
}

if (number5 == 0) { 
zeroNumber = zeroNumber + 1;
}

System.out.printf("The Total number of Positive numbers is %d%n", positiveNumber);
System.out.printf("The Total number of Negative numbers is %d%n", negativeNumber);
System.out.printf("The Total number of Zeros is %d%n", zeroNumber);

}

}