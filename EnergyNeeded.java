import java.util.Scanner;

public class EnergyNeeded {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter amout of water in Kilograms: ");
float waterWeight = input.nextFloat();

System.out.print("Enter Initial temperature in Celsius: ");
float initialTemperature = input.nextFloat();

System.out.print("Enter Final temperature in Celsius: ");
float finalTemperature = input.nextFloat();

double energy = waterWeight * (finalTemperature - initialTemperature) * 4184;

System.out.printf("The energy needed is %.3f%n", energy);

}

}