import java.util.Scanner;

import java.util.Random;

public class LotteryGame {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Random randomNumber = new Random();

int lotteryNumber = randomNumber.nextInt(900) + 100;

System.out.print("Enter a three digit number: ");
int userGuess = sc.nextInt();

int userGuessDigit1 = (userGuess / 100);
int userGuessDigit2 = (userGuess % 100) / 10;
int userGuessDigit3 = (userGuess % 10);

int lotteryNumberDigit1 = (lotteryNumber / 100);
int lotteryNumberDigit2 = (lotteryNumber % 100) / 10;
int lotteryNumberDigit3 = (lotteryNumber % 10); 

if (lotteryNumber == userGuess) {
System.out.print("YOU HAVE WON $10,000!!!");
}


else if ((userGuessDigit1 == lotteryNumberDigit2) && (userGuessDigit2 == lotteryNumberDigit3) && (userGuessDigit3 == lotteryNumberDigit1)) {
System.out.print("YOU HAVE WON $3,000!!!");
}

else if ((userGuessDigit1 == lotteryNumberDigit3) && (userGuessDigit2 == lotteryNumberDigit1) && (userGuessDigit3 == lotteryNumberDigit2)) {
System.out.print("YOU HAVE WON $3,000!!!");
}

else if ((userGuessDigit1 == lotteryNumberDigit1) && (userGuessDigit2 == lotteryNumberDigit3) && (userGuessDigit2 == lotteryNumberDigit3)) {
System.out.print("YOU HAVE WON $3,000!!!");
}


else if ((userGuessDigit2 == lotteryNumberDigit1) && (userGuessDigit1 == lotteryNumberDigit3) && (userGuessDigit3 == lotteryNumberDigit2)) {
System.out.print("YOU HAVE WON $3,000!!!");
}

else if ((userGuessDigit2 == lotteryNumberDigit3) && (userGuessDigit1 == lotteryNumberDigit2) && (userGuessDigit3 == lotteryNumberDigit1)) {
System.out.print("YOU HAVE WON $3,000!!!");
}

else if ((userGuessDigit2 == lotteryNumberDigit2) && (userGuessDigit1 == lotteryNumberDigit3) && (userGuessDigit3 == lotteryNumberDigit1)) {
System.out.print("YOU HAVE WON $3,000!!!");
}


else if ((userGuessDigit3 == lotteryNumberDigit2) && (userGuessDigit1 == lotteryNumberDigit3) && (userGuessDigit2 == lotteryNumberDigit1)) {
System.out.print("YOU HAVE WON $3,000!!!");
}

else if ((userGuessDigit3 == lotteryNumberDigit1) && (userGuessDigit1 == lotteryNumberDigit2) && (userGuessDigit2 == lotteryNumberDigit3)) {
System.out.print("YOU HAVE WON $3,000!!!");
}

else if ((userGuessDigit3 == lotteryNumberDigit3) && (userGuessDigit1 == lotteryNumberDigit2) && (userGuessDigit2 == lotteryNumberDigit1)) {
System.out.print("YOU HAVE WON $3,000!!!");
}


else if ((userGuessDigit1 == lotteryNumberDigit1) || (userGuessDigit1 == lotteryNumberDigit2) || (userGuessDigit1 == lotteryNumberDigit3)) {
System.out.print("YOU HAVE WON $1,000!!!");
}

else if ((userGuessDigit2 == lotteryNumberDigit1) || (userGuessDigit2 == lotteryNumberDigit2) || (userGuessDigit2 == lotteryNumberDigit3)) {
System.out.print("YOU HAVE WON $1,000!!!");
}

else if ((userGuessDigit3 == lotteryNumberDigit1) || (userGuessDigit3 == lotteryNumberDigit2) || (userGuessDigit3 == lotteryNumberDigit3)) {
System.out.print("YOU HAVE WON $1,000!!!");
}


else {
System.out.print("Sorry You did not win. Try again?");
}

}

}