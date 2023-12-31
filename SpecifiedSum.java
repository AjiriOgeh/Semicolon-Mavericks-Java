import java.util.Scanner; 

public class SpecifiedSum {

public static void main(String[] args) {

Scanner inputReader = new Scanner(System.in);

System.out.print("Enter the intial number for comparison number: ");
int number1 = inputReader.nextInt();

int total = 0;

while (number1 > total) {

System.out.println("Enter other numbers for the total: ");
int numberOther = inputReader.nextInt();

total = numberOther + total;
System.out.println("the total is "+total);

}
if( number1 == total){

System.out.print("the total is "+total+" is equal to the number is "+number1);
}

else{

System.out.print("the total is "+total+" is greater than the number is "+number1);
}

}




}