import java.util.Scanner;

public class DivisibleByNumbers5And6 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int number = input.nextInt();

if ((number % 6 == 0) && (number % 5 ==0 )) {
System.out.printf("Is %d divisible by 5 and 6? true\n",number );
System.out.printf("Is %d divisible by 5 or 6? true\n",number );
System.out.printf("Is %d divisible by 5 or 6, but not both ? false",number );
}

if ((number % 6 == 0) && (number % 5 !=0 )) {
System.out.printf("Is %d divisible by 5 and 6? false.\n",number );
System.out.printf("Is %d divisible by 5 or 6? true.\n",number );
System.out.printf("Is %d divisible by 5 or 6, but not both ? true.\n", number );
}

if ((number % 6 != 0) && (number % 5 ==0 )) {
System.out.printf("Is %d divisible by 5 and 6? false.\n",number );
System.out.printf("Is %d divisible by 5 or 6? true.\n",number );
System.out.printf("Is %d divisible by 5 or 6, but not both ? true.\n", number );
}
 
if ((number % 6 != 0) && (number % 5 !=0)) {
System.out.printf("Is %d divisible by 5 and 6? false.\n", number);
System.out.printf("Is %d divisible by 5 or 6? false.\n", number);
System.out.printf("Is %d divisible by 5 or 6, but not both ? true.\n", number);
}

}

}