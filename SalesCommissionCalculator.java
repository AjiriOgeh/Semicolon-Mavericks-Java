import java.util.Scanner;

public class SalesCommissionCalculator {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter value of salesperson item sold during the week: $");
double itemValue = sc.nextDouble();

double earnings = 0.0;

int itemNumber = 0;

while (itemValue !=-100){

itemNumber = itemNumber + 1;

earnings = itemValue + earnings;

System.out.print("Enter value of salesperson item sold during the week: $");
itemValue = sc.nextDouble();

}

double finalEarnings = 200 + (earnings * 0.09);

System.out.printf("Total earnings of the sales person after selling %d items is %.2f",itemNumber,finalEarnings);

}




}