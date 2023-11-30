import java.util.Scanner;

public class TimesTable{

public static void main(String[] args){

Scanner numberScanner = new Scanner(System.in);

System.out.print("Enter a number from 1-10 ");
int number = numberScanner.nextInt();

int multiplier = 1;

if ((number < 1) || (number > 10)){
System.out.print("The Number is invalid");
}

else{
while (multiplier < 13){

int product = number * multiplier;

System.out.printf("%d x %d =  %d%n", number, multiplier, product);

multiplier = multiplier + 1;
}

}

}

}