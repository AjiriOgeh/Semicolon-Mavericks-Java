public class TabularOutput {

public static void main(String[] args) {

int number = 1;


System.out.println("N1\tN2\tN3\tN4");

while (number <= 5) {

int numberSquared = number * number; 

int numberCube = number * number * number; 

int numberFourthPower = number * number * number * number; 

System.out.println(number+"\t"+numberSquared+"\t"+numberCube+"\t"+numberFourthPower);

number = number + 1;

}

}

}