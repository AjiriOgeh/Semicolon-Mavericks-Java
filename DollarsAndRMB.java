import java.util.Scanner;

public class DollarsAndRMB {

public static void main(String[] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter the exchange rate from dollars to RMB: ");
float exchangeRate = inputCollector.nextFloat();

System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
int currency = inputCollector.nextInt();

if (currency == 0) {
System.out.print("Enter the dollar amount: ");
float dollars = inputCollector.nextFloat();
double newRMB = dollars * exchangeRate;
System.out.printf("$%.1f is %.1f yuan" ,dollars, newRMB );
}

if (currency == 1) {
System.out.print("Enter the RMB amount: ");
float rMB = inputCollector.nextFloat();
double newDollars = rMB / exchangeRate;
System.out.printf("%.1f yuan is $%.2f", rMB, newDollars);
}

}

}