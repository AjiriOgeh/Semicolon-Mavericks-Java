import java.util.Scanner;

public class GasMileage {

public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter the miles driven: ");
int milesDriven = inputCollector.nextInt();

System.out.print("Enter the gallon used: ");
int gallonsUsed = inputCollector.nextInt();



int count = 0;
double totalMilesPerGallon = 0;

while (milesDriven != -1){
double milesPerGallon = (milesDriven * 1.0) / gallonsUsed;

totalMilesPerGallon = milesPerGallon + totalMilesPerGallon;
count = count + 1;

System.out.printf("The miles per gallon for trip %d is %.2f%n",count , milesPerGallon);

System.out.print("Enter the miles driven: ");
milesDriven = inputCollector.nextInt();

System.out.print("Enter the gallon used: ");
gallonsUsed = inputCollector.nextInt();

}

System.out.printf("The total miles per gallon is for %d trips is %.2f",count, totalMilesPerGallon);


}




}