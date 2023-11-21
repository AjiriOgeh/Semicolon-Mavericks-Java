import java.util.Scanner;

public class GreatPyramidOfGiza {

public static void main(String[] args) {

Scanner takeInput = new Scanner(System.in);

System.out.print("Enter the estimated number of stones used in tons: ");
int stonesUsed =  takeInput.nextInt();

System.out.print("Enter the average weight of each stone in tons: ");
int averageStoneWeight= takeInput.nextInt();

System.out.print("Enter the Number of years taken to build the Pyramid: ");
int numberOfYears = takeInput.nextInt();

double weightOfPyramid = averageStoneWeight * stonesUsed;

double weightOfPyramidEachYear = weightOfPyramid / numberOfYears;

double weightOfPyramidEachHour = weightOfPyramidEachYear / 8760;

double weightOfPyramidEachMinute = weightOfPyramidEachHour / 60;

System.out.printf("The weight of pyramid built each year is %.3f tons\n", weightOfPyramidEachYear);
System.out.printf("The weight of pyramid built each hour is %.3f tons\n", weightOfPyramidEachHour);
System.out.printf("The weight of pyramid built each minute is %.3f tons\n", weightOfPyramidEachMinute);

}

}