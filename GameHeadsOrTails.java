import java.util.Scanner;

import java.util.Random;

public class GameHeadsOrTails {

public static void main(String[] args) {

Scanner inputCollector = new Scanner(System.in);

Random randomNumber = new Random();

int headOrTail = randomNumber.nextInt(2);

System.out.print("Enter a guess (either 0 or 1): ");
int guess = inputCollector.nextInt();

if (headOrTail == guess) {
System.out.print("You made a correct guess!!!");
}

else {
System.out.print("You made an incorrect guess");
}

}

}