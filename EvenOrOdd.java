import java.util.Scanner;

public class EvenOrOdd {

public static void main(String[] args) {

Scanner collect = new Scanner(System.in);

System.out.print("Enter Integer: ");
int number = collect.nextInt();

int remainder = number % 2;

if (remainder == 0) {
System.out.printf("%d is an Even number", number);
}

if (remainder != 0) {
System.out.printf("%d is an Odd number", number);
}

}

}

