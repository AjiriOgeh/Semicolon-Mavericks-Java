import java.util.Scanner;

public class ValidatingUserInput{

public static void main(String[] args) {

Scanner takeInput = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = takeInput.nextInt();


while ((number != 2) && (number != 1)){
System.out.print("Enter a number: ");
number = takeInput.nextInt();
}

System.out.print(number);

}



}


