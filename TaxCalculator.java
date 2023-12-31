import java.util.Scanner;

public class TaxCalculator{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

double tax = 0;

int counter = 1;
while(counter <= 3){

System.out.print("Enter your earnings for the year: $");
double earnings = input.nextDouble();

counter = counter + 1;

if (earnings <= 30000){
tax = earnings * 0.15;
System.out.print("$"+tax+"\n");
}
else {
tax = (30000 * 0.15) + ((earnings - 30000)  * 0.2);
System.out.print("$"+tax+"\n");
}


}











}






}