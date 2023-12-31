public class CheckerBoardPatternOfAsterisks{

public static void main(String [] args){

int counterOuterLoop = 0;

while ( counterOuterLoop <= 6 ){

int counterInnerLoop = 0;

while (counterInnerLoop <= 6){
System.out.print("* ");

counterInnerLoop = counterInnerLoop + 1;
}

counterOuterLoop = counterOuterLoop + 1;

System.out.println();

if (counterOuterLoop % 2 == 0)

continue;

System.out.print(" ");


}


}


}