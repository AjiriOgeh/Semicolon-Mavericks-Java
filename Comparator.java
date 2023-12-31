import java.util.Scanner;

public class Comparator{

public static void main(String [] args){

Scanner numberDecoder = new Scanner(System.in);

System.out.print("Enter the first number: ");
int number1 = numberDecoder.nextInt();

System.out.print("Enter the second number: ");
int number2 = numberDecoder.nextInt();

if (number1 == number2){
System.out.print(0);
}

if(number1 > number2){
System.out.print(1);
}

if(number2 > number1){
System.out.print(-1);
}

}


}