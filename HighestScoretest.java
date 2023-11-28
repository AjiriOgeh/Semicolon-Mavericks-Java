import java.util.Scanner;

public class HighestScoretest {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int counter = 1;

float highestScore = 0;
String highestName = "John doe";

System.out.print("Enter the number of students: ");
int studentsNumber = input.nextInt();

while (counter <= studentsNumber){

System.out.print("Enter the name of the student: ");
String name = input.next();

System.out.print("Enter the score of student:" );
float score = input.nextFloat();

if (score > highestScore){
highestScore = score;
highestName = name;
}

counter = counter + 1;
}

System.out.printf("The person with the Higest score is %s with %.1f" ,highestName, highestScore);

}

}