import java.util.Scanner;

public class CreditLimitCalculator {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.printf("Do you want to check a customers details: ");
int creditCheck = sc.nextInt();

while (creditCheck !=-1){

System.out.print("Enter your account number: ");
int accountNumber = sc.nextInt();

System.out.print("Enter balance at the beginning of the month: ");
int oldBalance = sc.nextInt();

System.out.print("Enter the total of all items charged by the customer: ");
int totalItems = sc.nextInt();

System.out.print("Enter the total credits appplied to customer's account this month: ");
int totalCredits = sc.nextInt();

System.out.print("Enter the allowed credit limit:");
int allowedCredits = sc.nextInt();

int newBalance = oldBalance + totalItems - totalCredits;

System.out.printf("The new balance is %d%n",newBalance);

if(oldBalance > newBalance){
System.out.printf("Credit limit exceeded%n");
}


System.out.print("Do you want to check a customers details");
creditCheck = sc.nextInt();



}



}


}











































































































/*System.out.print("Enter your account number: ");
int accoutNumber = sc.nextInt();

System.out.print("Enter balance at the beginning of the month: ");
int oldBalance = sc.nextInt();

System.out.print("Enter the total of all items charged by the customer: ");
int totalItems = sc.nextInt();

System.out.print("Enter the total credits appplied to customer account this month: ");
int totalCredits = sc.nextInt();

System.out.print("Enter the allowed credit limit:");
int allowedCredits = sc.nextInt();

int newBalance = oldBalance + totalItems - totalCredits*/