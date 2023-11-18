import java.util.Scanner;

public class MonthAndYear {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the month: ");
int month = input.nextInt();

System.out.print("Enter the year: ");
int year = input.nextInt();

String month1 = "January";
String month2 = "February";
String month3 = "March";
String month4 = "April";
String month5 = "May";
String month6 = "June";
String month7 = "July";
String month8 = "August";
String month9 = "September";
String month10 = "October";
String month11 = "November";
String month12 = "December";

if (month == 1) {
System.out.printf("%s %d has 31 days",month1,year);
}

if ((month == 2) && (year % 4 != 0)) {
System.out.printf("%s %d has 28 days",month2,year);
}

if ((month == 2) && (year % 4 == 0)) {
System.out.printf("%s %d has 29 days",month2,year);
}

if (month == 3) {
System.out.printf("%s %d has 31 days",month3,year);
}

if (month == 4) {
System.out.printf("%s %d has 30 days",month4,year);
}

if (month == 5) {
System.out.printf("%s %d has 31 days",month5,year);
}

if (month == 6) {
System.out.printf("%s %d has 30 days",month6,year);
}

if (month == 7) {
System.out.printf("%s %d has 31 days",month7,year);
}

if (month == 8) {
System.out.printf("%s %d has 31 days",month8,year);
}

if (month == 9) {
System.out.printf("%s %d has 30 days",month9,year);
}

if (month == 10) {
System.out.printf("%s %d has 31 days",month10,year);
}

if (month == 11) {
System.out.printf("%s %d has 30 days",month11,year);
}

if (month == 12) {
System.out.printf("%s %d has 31 days",month12,year);
}

}

}