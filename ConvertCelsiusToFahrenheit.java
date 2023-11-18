import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

public static void main(String[] args) { 

Scanner sc = new Scanner(System.in);

System.out.print("Enter Temperature in Celsius: ");
int celsius = sc.nextInt();

double fahrenheit = (9.0 / 5) * celsius + 32;

System.out.printf("%d Celsius is %.1f Farenheit", celsius, fahrenheit);
}

}