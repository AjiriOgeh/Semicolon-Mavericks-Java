import java.util.Scanner;

public class MinutesToYears {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
int minutes = input.nextInt();

int years = minutes / 525600;

int days = (minutes % 525600) / 1440;

System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days); 

}

}

