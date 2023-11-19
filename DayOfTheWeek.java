import java.util.Scanner;

public class DayOfTheWeek{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter year: (e.g., 2012): ");
int year = sc.nextInt();

System.out.print("Enter month: 1-12: ");
int m = sc.nextInt();

System.out.print("Enter day of the month: 1-31: ");
int q = sc.nextInt();

if (m == 1) {
m = 13;
year--;
}

if (m == 2) {
m = 14;
year--;
}

int k = year % 100;

int j = year / 100;

int h = (q + ((26 * (m + 1) ) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

if (h == 0) {
System.out.print("Day of the week is Saturday");
}

if (h == 1) {
System.out.print("Day of the week is Sunday");
}

if (h == 2) {
System.out.print("Day of the week is Monday");
}

if (h == 3) {
System.out.print("Day of the week is Tuesday");
}

if (h == 4) {
System.out.print("Day of the week is Wednesday");
}

if (h == 5) {
System.out.print("Day of the week is Thursday");
}

if (h == 6) {
System.out.print("Day of the week is Friday");
}

}

}