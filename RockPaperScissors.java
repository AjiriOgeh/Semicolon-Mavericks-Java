import java.util.Scanner;

public class RockPaperScissors {

public static void main(String[] args) {

Scanner collector = new Scanner(System.in);

System.out.print("Enter player one name: ");
String player1 = collector.nextLine();

System.out.print("Enter player two name: ");
String player2 = collector.nextLine();

System.out.printf("%s enter a number 0, 1, 2: ",player1);
int player1Hand = collector.nextInt();

System.out.printf("%s enter a number 0, 1, 2: ",player2);
int player2Hand = collector.nextInt();

if ((player1Hand == 0) && (player2Hand == 0)) {
System.out.printf("%s and %s draw", player1, player2);
}

if ((player1Hand == 1) && (player2Hand == 1)) {
System.out.printf("%s and %s draw", player1, player2);
}

if ((player1Hand == 2) && (player2Hand == 2)) {
System.out.printf("%s and %s draw", player1, player2);
}


if ((player1Hand == 0 ) && (player2Hand == 1)) {
System.out.printf("%s won %s", player2, player1);
}

if ((player1Hand == 1 ) && (player2Hand == 0)) {
System.out.printf("%s won %s", player1, player2);
}


if ((player1Hand == 1 ) && (player2Hand == 2)) {
System.out.printf("%s won %s", player2, player1);
}

if ((player1Hand == 2 ) && (player2Hand == 1)) {
System.out.printf("%s won %s", player1, player2);
}


if ((player1Hand == 2 ) && (player2Hand == 0)) {
System.out.printf("%s won %s", player2, player1);
}

if ((player1Hand == 0 ) && (player2Hand == 2)) {
System.out.printf("%s won %s", player1, player2);
}

}

}