import java.util.Scanner;

import java.util.Arrays;

public class MBTIPersonalityTestApp {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		MBTIPersonalityTest myPersonalityTest = new MBTIPersonalityTest();
		
		System.out.println("What is your name");
		String name = input.nextLine();
		
		myPersonalityTest.setName(name);
		
		System.out.println();
			
		myPersonalityTest.setPersonalityTestQuestions();
	
		myPersonalityTest.getPersonalityTestAnswers();

		System.out.println("Hello "+myPersonalityTest.getName()+" You selected");

		myPersonalityTest.arrangeExtrovertedOrIntroverted();

		myPersonalityTest.arrangeSensingOrIntuitive();

		myPersonalityTest.arrangeThinkingOrFeeling();

		myPersonalityTest.arrangeJudgingOrPerceptive();
	
		System.out.println(myPersonalityTest.getPersonalityType());

		myPersonalityTest.personalityTypeDescription();

	}


}
