import java.util.Scanner;

public class Palindromes{

public static void main(String[] args){

Scanner numberDecoder = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int number = numberDecoder.nextInt();


while ((number < 9999) || (number >99999)){
System.out.print("Enter a five another digit number: ");
number = numberDecoder. nextInt();
}

int n1Digit1 = number / 10000;
int n1Digit2 = (number % 10000) / 1000;
int n1Digit3 = (number % 1000) / 100;
int n1Digit4 = (number % 100) / 10;
int n1Digit5 = number % 10;

int n2Digit1 = number % 10;
int n2Digit2 = (number % 100) / 10;
int n2Digit3 = (number % 1000) / 100;
int n2Digit4 = (number % 10000) / 1000;
int n2Digit5 = number / 10000;

if((n1Digit1 == n2Digit1) && (n1Digit2 == n2Digit2) && (n1Digit3 == n2Digit3) && (n1Digit4 == n2Digit4) && (n1Digit5 == n2Digit5)){
System.out.print("It is a palindrome");
}

else{
System.out.print("It is not a palindrome");
}

}




}