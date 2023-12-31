import java.util.Scanner; 

public class WorldPopulationGrowth {

public static void main (String [] args) {


double worldPopulation = 8076994345.00;

double newPopulation = 0;

int year = 1;

System.out.println("Year  C.Population   N.Population   Difference");

while (year <=75){

newPopulation =  worldPopulation * (1 + (0.9/100));

double difference = newPopulation - worldPopulation;

System.out.printf("%d  \t%.0f  \t%.0f  \t%.0f\n",year, worldPopulation, newPopulation, difference);

worldPopulation = newPopulation;

year = year + 1;

}







}




}