import java.util.Scanner;

public class PopulationGrowthCalculator {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the current year population: ");
long currentPopulation = sc.nextLong();

System.out.print("Enter the growth rate: ");
float growthRate = sc.nextFloat();

float growthRateConvert = (growthRate / 100);

double afterOneYear = currentPopulation * (1 + growthRateConvert);
double afterTwoYears = afterOneYear * (1 + growthRateConvert);
double afterThreeYears = afterTwoYears * (1 + growthRateConvert);
double afterFourYears = afterThreeYears * (1 + growthRateConvert);
double afterFiveYears = afterFourYears * (1 + growthRateConvert);

System.out.printf("Estimated world population after One year: %.2f%n", afterOneYear);
System.out.printf("Estimated world population after Two years: %.2f%n", afterTwoYears);
System.out.printf("Estimated world population after Three years: %.2f%n", afterThreeYears);
System.out.printf("Estimated world population after Four years: %.2f%n", afterFourYears);
System.out.printf("Estimated world population after Five years: %.2f%n", afterFiveYears);

}

}