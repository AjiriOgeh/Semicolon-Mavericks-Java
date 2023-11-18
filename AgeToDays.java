import java.util.Scanner;

public class AgeToDays{

public static void main(String[] args) {

Scanner takeInput = new Scanner(System.in);

System.out.print("Enter the age: ");
int age = takeInput.nextInt();

int days = age * 365;

System.out.printf("%d", days);

}

}