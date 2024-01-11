import java.util.Scanner;

import java.util.Arrays;

public class MBTIPersonalityTest {

	private String name;

	private String[] personalityTestQuestionsArray = new String[21];
	
	private String[] personalityTestAnswersArray = new String[21];
	
	private String[] extrovertedOrIntrovertedArray = new String[5];

	private String[] sensingOrIntuitiveArray = new String[5];

	private String[] thinkingOrFeelingArray = new String[5];

	private String[] judgingOrPerceptiveArray = new String[5];

	private String[] personalityTypeArray = new String[4];

	private String myPersonalityType;

	Scanner input = new Scanner(System.in);

	public void setName(String name){

		this.name = name;	
	
	}

	public String getName() {

		return name;		

	}
	
	public setPersonalityTestQuestions() {
		
		personalityTestQuestionsArray[1] = "1)  A. expend energy, enjoy groups\t\tB. conserve energy, enjoy one-on-one";
		personalityTestQuestionsArray[2] = "2)  A. interpret literally\t\tB. look for meaning and possibilites";
		personalityTestQuestionsArray[3] = "3)  A. logical, thinking, questioning\t\tB. emphathetic, feeling, accommodating";
		personalityTestQuestionsArray[4] = "4)  A. organized, orderly\t\tB. flexible, adaptable";
		personalityTestQuestionsArray[5] = "5)  A. more outgoing, think out loud\t\tB. more reserved, think to yourself";
		personalityTestQuestionsArray[6] = "6)  A. practical, realistic, experiential\t\tB. imaginative, innovative, theoretical";		
		personalityTestQuestionsArray[7] = "7)  A. candid, straight forward, frank\t\tB. tactful, kind, encouraging";
		personalityTestQuestionsArray[8] = "8)  A. plan, schedule\t\tB. unplanned, spontaneous";
		personalityTestQuestionsArray[9] = "9)  A. seek many tasks, public activities, interaction with others\t\tB. seek private, soliitary activities with quiet to concentrate";
		personalityTestQuestionsArray[10] = "10) A. standard, usual, conventional\t\tB. different, novel, unique";
		personalityTestQuestionsArray[11] = "11) A. firm, tend to criticize, hold the line\t\tB. gentle, tend to appreciate, conciliate";
		personalityTestQuestionsArray[12] = "12) A. regulated, structured\t\tB. easy-going, live and let live";
		personalityTestQuestionsArray[13] = "13) A. external, communicative, express yourself\t\tB. internal, reticent, keep to yourself";	
		personalityTestQuestionsArray[14] = "14) A. focus on here-and-now\t\tB. look to the future, global perspective, big picture";
		personalityTestQuestionsArray[15] = "15) A. tough-minded, just\t\tB. tender-hearted, merciful";
		personalityTestQuestionsArray[16] = "16) A. preperation, plan ahead\t\tB. go with the flow, adapt as you go";
		personalityTestQuestionsArray[17] = "17) A. active, initiate\t\tB. reflective, deliberate";
		personalityTestQuestionsArray[18] = "18) A. facts, things, what is\t\tB. ideas, dreams, what could be, philosophical";
		personalityTestQuestionsArray[19] = "19) A. matter of fact, issue-oriented\t\tB. sensitive, people-oriented, compassionate";
		personalityTestQuestionsArray[20] = "20) A. control, govern\t\tB. latitude, freedom";
		
	}

	public String[] getPersonalityTestAnswers() {
				
		for(int count = 1; count < 21; count++) {

			System.out.println(personalityTestQuestionsArray[count]);

			String answer = input.nextLine();

				while (!answer.equalsIgnoreCase("A") &&  !answer.equalsIgnoreCase("B")){
					
					System.out.println("");
					
					System.out.println("Expected A or B as Response");

					System.out.println("I know this is an error, Please retry again");
					
					System.out.println(personalityTestQuestionsArray[count]);

					 answer = input.nextLine();
				}
			
			personalityTestAnswersArray[count] = answer;
	
			System.out.println("");
					
		}
		
		return personalityTestAnswersArray;
	}

	public void arrangeExtrovertedOrIntroverted() {

		extrovertedOrIntrovertedArray[0] = personalityTestAnswersArray[1];
		extrovertedOrIntrovertedArray[1] = personalityTestAnswersArray[5];
		extrovertedOrIntrovertedArray[2] = personalityTestAnswersArray[9];
		extrovertedOrIntrovertedArray[3] = personalityTestAnswersArray[13];
		extrovertedOrIntrovertedArray[4] = personalityTestAnswersArray[17];
		
		int extroverted = 0;
		int introverted = 0;
	

		for(int count = 0; count < extrovertedOrIntrovertedArray.length; count++){
			
			if(extrovertedOrIntrovertedArray[count].equalsIgnoreCase("A")) {

				extroverted++;

			}

			if(extrovertedOrIntrovertedArray[count].equalsIgnoreCase("B")) {

				introverted++;

			}
			
		}
		
		if(extroverted > introverted) {

			personalityTypeArray[0] = "E";			

		}

		if(introverted > extroverted){

			personalityTypeArray[0] = "I";
				
		}

		if(personalityTestAnswersArray[1].equalsIgnoreCase("A")) {
			System.out.println("A. expend energy, enjoy groups");
		}
		
		if(personalityTestAnswersArray[1].equalsIgnoreCase("B")) {
			System.out.println("B. conserve energy, enjoy one-on-one");
		}

		if(personalityTestAnswersArray[5].equalsIgnoreCase("A")) {
			System.out.println("A. more outgoing, think out loud");
		}
		
		if(personalityTestAnswersArray[5].equalsIgnoreCase("B")) {
			System.out.println("B. more reserved, think to yourself");
		}

		if(personalityTestAnswersArray[9].equalsIgnoreCase("A")) {
			System.out.println("A. seek many tasks, public activities, interaction with others");
		}
		
		if(personalityTestAnswersArray[9].equalsIgnoreCase("B")) {
			System.out.println("B. seek private, soliitary activities with quiet to concentrate");
		}

		if(personalityTestAnswersArray[13].equalsIgnoreCase("A")) {
			System.out.println("A. external, communicative, express yourself");
		}
		
		if(personalityTestAnswersArray[13].equalsIgnoreCase("B")) {
			System.out.println("B. internal, reticent, keep to yourself");
		}

		if(personalityTestAnswersArray[17].equalsIgnoreCase("A")) {
			System.out.println("A. active, initiate");
		}
		
		if(personalityTestAnswersArray[17].equalsIgnoreCase("B")) {
			System.out.println("B. reflective, deliberate");
		}

		System.out.printf("Number of A selected: %d%n", extroverted);
		System.out.printf("Number of B selected: %d%n", introverted);
		System.out.println("");
	}
	
	public void arrangeSensingOrIntuitive() {

		sensingOrIntuitiveArray[0] = personalityTestAnswersArray[2];
		sensingOrIntuitiveArray[1] = personalityTestAnswersArray[6];
		sensingOrIntuitiveArray[2] = personalityTestAnswersArray[10];
		sensingOrIntuitiveArray[3] = personalityTestAnswersArray[14];
		sensingOrIntuitiveArray[4] = personalityTestAnswersArray[18];
		
		int sensing = 0;
		int intuitive = 0;
	

		for(int count = 0; count < sensingOrIntuitiveArray.length; count++){
			
			if(sensingOrIntuitiveArray[count].equalsIgnoreCase("A")) {

				sensing++;

			}

			if(sensingOrIntuitiveArray[count].equalsIgnoreCase("B")) {

				intuitive++;

			}
			
		}
	
		if(sensing > intuitive) {

			personalityTypeArray[1] = "S";
			
		}

		if(intuitive > sensing) {

			personalityTypeArray[1] = "N";
		
		}

		if(personalityTestAnswersArray[2].equalsIgnoreCase("A")) {
			System.out.println("A. interpret literally");
		}
		
		if(personalityTestAnswersArray[2].equalsIgnoreCase("B")) {
			System.out.println("B. look for meaning and possibilites");
		}

		if(personalityTestAnswersArray[6].equalsIgnoreCase("A")) {
			System.out.println("A. practical, realistic");
		}
		
		if(personalityTestAnswersArray[6].equalsIgnoreCase("B")) {
			System.out.println("B. imaginative, innovative, theoretical");
		}

		if(personalityTestAnswersArray[10].equalsIgnoreCase("A")) {
			System.out.println("A. standard, usual, conventional");
		}
		
		if(personalityTestAnswersArray[10].equalsIgnoreCase("B")) {
			System.out.println("B. different, novel, unique");
		}

		if(personalityTestAnswersArray[14].equalsIgnoreCase("A")) {
			System.out.println("A. focus on here-and-now");
		}
		
		if(personalityTestAnswersArray[14].equalsIgnoreCase("B")) {
			System.out.println("B. look to the future, global perspective, big picture");
		}

		if(personalityTestAnswersArray[18].equalsIgnoreCase("A")) {
			System.out.println("A. facts, things, what is");
		}
		
		if(personalityTestAnswersArray[18].equalsIgnoreCase("B")) {
			System.out.println("B. ideas, dreams, what could be, philosophical");
		}

		System.out.printf("Number of A selected: %d%n", sensing);
		System.out.printf("Number of B selected: %d%n", intuitive);
		System.out.println("");

	}

	public void arrangeThinkingOrFeeling() {

		thinkingOrFeelingArray[0] = personalityTestAnswersArray[3];
		thinkingOrFeelingArray[1] = personalityTestAnswersArray[7];
		thinkingOrFeelingArray[2] = personalityTestAnswersArray[11];
		thinkingOrFeelingArray[3] = personalityTestAnswersArray[15];
		thinkingOrFeelingArray[4] = personalityTestAnswersArray[19];
		
		int thinking = 0;
		int feeling = 0;
	

		for(int count = 0; count < thinkingOrFeelingArray.length; count++){
			
			if(thinkingOrFeelingArray[count].equalsIgnoreCase("A")) {

				thinking++;

			}

			if(thinkingOrFeelingArray[count].equalsIgnoreCase("B")) {

				feeling++;

			}
			
		}

		if(thinking > feeling) {

			personalityTypeArray[2] = "T";
			
		}

		if(feeling > thinking) {

			personalityTypeArray[2] = "F";
		
		}

		if(personalityTestAnswersArray[3].equalsIgnoreCase("A")) {
			System.out.println("A. logical, thinking, questioning");
		}
		
		if(personalityTestAnswersArray[3].equalsIgnoreCase("B")) {
			System.out.println("B. emphathetic, feeling, accommodating");
		}

		if(personalityTestAnswersArray[7].equalsIgnoreCase("A")) {
			System.out.println("A. candid, straight forward, frank");
		}
		
		if(personalityTestAnswersArray[7].equalsIgnoreCase("B")) {
			System.out.println("B. tactful, kind, encouraging");
		}

		if(personalityTestAnswersArray[11].equalsIgnoreCase("A")) {
			System.out.println("A. firm, tend to criticize, hold the line");
		}
		
		if(personalityTestAnswersArray[11].equalsIgnoreCase("B")) {
			System.out.println("B. gentle, tend to appreciate, conciliate");
		}

		if(personalityTestAnswersArray[15].equalsIgnoreCase("A")) {
			System.out.println("A. tough-minded, just");
		}
		
		if(personalityTestAnswersArray[15].equalsIgnoreCase("B")) {
			System.out.println("B. tender-hearted, merciful");
		}

		if(personalityTestAnswersArray[19].equalsIgnoreCase("A")) {
			System.out.println("A. matter of fact, issue-oriented");
		}
		
		if(personalityTestAnswersArray[19].equalsIgnoreCase("B")) {
			System.out.println("B. sensitive, people-oriented, compassionate");
		}
	
		System.out.printf("Number of A selected: %d%n", thinking);
		System.out.printf("Number of B selected: %d%n", feeling);
		System.out.println("");

	}

	public void arrangeJudgingOrPerceptive() {

		judgingOrPerceptiveArray[0] = personalityTestAnswersArray[4];
		judgingOrPerceptiveArray[1] = personalityTestAnswersArray[8];
		judgingOrPerceptiveArray[2] = personalityTestAnswersArray[12];
		judgingOrPerceptiveArray[3] = personalityTestAnswersArray[16];
		judgingOrPerceptiveArray[4] = personalityTestAnswersArray[20];
		
		int judging = 0;
		int perceptive = 0;
	

		for(int count = 0; count < judgingOrPerceptiveArray.length; count++){
			
			if(judgingOrPerceptiveArray[count].equalsIgnoreCase("A")) {

				judging++;

			}

			if(judgingOrPerceptiveArray[count].equalsIgnoreCase("B")) {

				perceptive++;

			}
			
		}

		if(judging > perceptive) {

			personalityTypeArray[3] = "J";
			
		}

		if(perceptive > judging) {

			personalityTypeArray[3] = "P";
		
		}

		if(personalityTestAnswersArray[4].equalsIgnoreCase("A")) {
			System.out.println("A. organized, orderly");
		}
		
		if(personalityTestAnswersArray[4].equalsIgnoreCase("B")) {
			System.out.println("B. flexible, adaptable");
		}

		if(personalityTestAnswersArray[8].equalsIgnoreCase("A")) {
			System.out.println("A. plan, schedule");
		}
		
		if(personalityTestAnswersArray[8].equalsIgnoreCase("B")) {
			System.out.println("B. unplanned, spontaneous");
		}

		if(personalityTestAnswersArray[12].equalsIgnoreCase("A")) {
			System.out.println("A. regulated, structured");
		}
		
		if(personalityTestAnswersArray[12].equalsIgnoreCase("B")) {
			System.out.println("B. easy-going, live and let live");
		}

		if(personalityTestAnswersArray[16].equalsIgnoreCase("A")) {
			System.out.println("A. preperation, plan ahead");
		}
		
		if(personalityTestAnswersArray[16].equalsIgnoreCase("B")) {
			System.out.println("B. go with the flow, adapt as you go");
		}

		if(personalityTestAnswersArray[20].equalsIgnoreCase("A")) {
			System.out.println("A. control, govern");
		}
		
		if(personalityTestAnswersArray[20].equalsIgnoreCase("B")) {
			System.out.println("B. latitude, freedom");
		}

		System.out.printf("Number of A selected: %d%n", judging);
		System.out.printf("Number of B selected: %d%n", perceptive);
		System.out.println("");

	}

	public String getPersonalityType() {
		
		myPersonalityType= personalityTypeArray[0]+""+personalityTypeArray[1]+""+personalityTypeArray[2]+""+personalityTypeArray[3];

		return myPersonalityType;

	}

	public void personalityTypeDescription() {

		switch(myPersonalityType) {

			case("INFP"):
				System.out.println("""
						The INFP Personality Type
						
							Healer
							The Thoughtful Idealist(MBTI)
							The Mediator(16Personalities)
						
						INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer,
						possibilities are paramount; the realism of the moment is only of passing concern. They see
						potential for a better future, and pursue truth and meaning with their own individual flair.

						INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal
						growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each
						person must find their own path. They enjoy spending time exploring their own ideas and values,
						and are gently encouraging to others to do the same. INFPs are creative and often artistic; they
						enjoy finding new outlets for self-expression.

						What does INFP stand for
						INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). INFP stands for Introversion, iNtuition,
						Feeling, and Perceiving, which are four core personality traits based on the work of psychologist
						C.G. Jung.

						Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are
						energized by time alone (Introverted), focus on ideas and concepts rather than facts and details
						(iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous
						and flexible rather than planned and organized (Perceiving).""");

				break;
	
			case("INTJ"):
				System.out.println("""
						The INTJ Personality Type

							Mastermind
							The Conceptual Planner(MBTI)
							The Architect(16Personalities)						

						INTJs are analytical problem-solvers, eager to improve systems and processes with their
						innovative ideas. They have a talent for seeing possibilities for improvement, whether at
						work, at home, or in themselves.

						Often intellectual, INTJs enjoy logical reasoning and complex problem-solving. They approach
						life by analyzing the theory behind what they see, and are typically focused inward, on their own
						thoughtful study of the world around them. INTJs are drawn to logical systems and are much less
						comfortable with the unpredictable nature of other people and their emotions. They are typically
						independent and selective about their relationships, preferring to associate with people who they
						find intellectually stimulating.

						What does INTJ stand for
						INTJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). INTJ stands for Introverted, iNtuitive,
						Thinking, Judging, which are four core personality traits based on the work of psychologist C.G.
						Jung.

						Each of the four letters of the INTJ code signifies a key personality trait of this type. INTJs are
						energized by time alone (Introverted), focus on ideas and concepts rather than facts and details
						(iNtuitive), make decisions based on logic and reason (Thinking) and prefer to be planned and
						organized rather than spontaneous and flexible (Judging).""");

				break;

			case("INFJ"):
				System.out.println("""
						The INFJ Personality Type
							
							Counselor
							The Insightful Visionary(MBTI)
							The Advocate(16Personalities)
						
						NFJs are thoughtful nurturers with a strong sense of personal integrity and a drive to help others
						realize their potential. Creative and dedicated, they have a talent for helping others with original
						solutions to their personal challenges.

						The Counselor has a unique ability to intuit others' emotions and motivations, and will often
						know how someone else is feeling before that person knows it himself. They trust their insights
						about others and have strong faith in their ability to read people. Although they are sensitive,
						they are also reserved; the INFJ is a private sort, and is selective about sharing intimate thoughts
						and feelings.

						INFJs search for meaning and purpose in their lives and in the outer world. They tend to have an
						immense interest in deeply understanding culture, society, and the universe as a whole. INFJs
						naturally see how every thought or action could potentially have important consequences, either
						positive or negative. This reflective and curious worldview gives INFJs a unique perspective and
						thoughtful approach to how they interact with others and the world around them.

						Ultimately, INFJs seek to turn their abstract and intellectual musings into concrete actions that
						can be applied and make a transformative impact on others. Although it is common for INFJs to
						get stuck in their heads and struggle with taking action, when they are at their best, their actions
						are aligned with their authentic values.

						What does INFJ stand for
						INFJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators
						of the Myers-Briggs Type Indicator (MBTI®). 

						Each of the four letters of the INFJ code signifies a key personality trait of this type. The letters
						INFJ stand for the following dimensions of personality, based on the work of psychologist C.G. Jung:

						Introverted: INFJs are energized by time alone
						iNtuitive: INFJs focus on ideas and concepts rather than facts and details
						Feeling: INFJs make decisions based on feelings and values
						Judging: INFJs prefer to be planned and organized rather than spontaneous and flexible
						""");

				break;

			case("INTP"):
				System.out.println("""
						The INTP Personality Type

							Architect
							The Objective Analyst(MBTI)
							The Logician(16Personalities)								

						INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer,
						possibilities are paramount; the realism of the moment is only of passing concern. They see
						potential for a better future, and pursue truth and meaning with their own individual flair.
	
						INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal
						growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each
						person must find their own path. They enjoy spending time exploring their own ideas and values,
						and are gently encouraging to others to do the same. INFPs are creative and often artistic; they 
						enjoy finding new outlets for self-expression.

						What does INTP stand for
						INTP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). INTP stands for Introverted, iNtuitive, 
						Thinking, Perceiving, which are four core personality traits based on the work of psychologist
						C.G. Jung.

						The INTP type describes a person who is energized by time alone (Introverted), who focuses on
						ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic
						and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and
						organized (Perceiving).""");

				break;

			case("ENFJ"):
				System.out.println("""
						The ENFJ Personality Type

							Teacher
							The Protagonist(16Personalities)	
					
						ENFJs are idealist organizers, driven to implement their vision of what is best for humanity. They
						often act as catalysts for human growth because of their ability to see potential in other people
						and their charisma in persuading others to their ideas. They are focused on values and vision, and
						are passionate about the possibilities for people.

						ENFJs are typically energetic and driven, and often have a lot on their plates. They are tuned into
						the needs of others and acutely aware of human suffering; however, they also tend to be 
						optimistic and forward-thinking, intuitively seeing opportunity for improvement. The ENFJ is 
						ambitious, but their ambition is not self-serving: rather, they feel personally responsible for
						making the world a better place.

						What does ENFJ stand for
						ENFJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Feeling, Judging. ENFJ indicates a
						person who is energized by time spent with others (Extraverted), who focuses on ideas and
						concepts rather than facts and details (iNtuitive), who makes decisions based on feelings and
						values (Feeling) and who prefers to be planned and organized rather than spontaneous and
						flexible (Judging).""");

				break;

			case("ENTP"):
				System.out.println("""
						The ENTP Personality Type

							Visionary
							The Debater(16Personalities)
												
						ENTPs are inspired innovators, motivated to find new solutions to intellectually challenging
						problems. They are curious and clever, and seek to comprehend the people, systems, and
						principles that surround them. Open-minded and unconventional, Visionaries want to analyze,
						understand, and influence other people.

						ENTPs enjoy playing with ideas and especially like to banter with others. They use their quick wit
						and command of language to keep the upper hand with other people, often cheerfully poking fun
						at their habits and eccentricities. While the ENTP enjoys challenging others, in the end they are
						usually happy to live and let live. They are rarely judgmental, but they may have little patience for
						people who can't keep up.
	
						What does ENTP stand for
						ENTP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Thinking, Perceiving. ENTP
						indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas
						and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and
						reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and 
						organized (Perceiving).""");

				break;

			case("ENTJ"):
				System.out.println("""
						The ENTJ personality type

							Commander
							The Commander(16Personalities)
					
						ENTJs are strategic leaders, motivated to organize change. They are quick to see inefficiency and
						conceptualize new solutions, and enjoy developing long-range plans to accomplish their vision.
						They excel at logical reasoning and are usually articulate and quick-witted.

						ENTJs are analytical and objective, and like bringing order to the world around them. When
						there are flaws in a system, the ENTJ sees them, and enjoys the process of discovering and
						implementing a better way. ENTJs are assertive and enjoy taking charge; they see their role as
						that of leader and manager, organizing people and processes to achieve their goals.

						What does ENTJ stand for
						ENTJ is an acronym used to describe one of the sixteen personality types created by Katharine 
						Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Thinking, Judging. ENTJ indicates
						a person who is energized by time spent with others (Extraverted), who focuses on ideas and
						concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason
						(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");

				break;

			case("ENFP"):
				System.out.println("""
						The ENFP personality type

							Champion
							The Campaigner(16Personalities)				
				
						ENFPs are people-centered creators with a focus on possibilities and a contagious enthusiasm for
						new ideas, people and activities. Energetic, warm, and passionate, ENFPs love to help other
						people explore their creative potential.

						ENFPs are typically agile and expressive communicators, using their wit, humor, and mastery of
						language to create engaging stories. Imaginative and original, ENFPs often have a strong artistic
						side. They are drawn to art because of its ability to express inventive ideas and create a deeper
						understanding of human experience.

						What does ENFP stand for
						ENFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). ENFP stands for Extraversion, iNtuition,
						Feeling, and Perceiving, which are four core personality traits based on the work of psychologist
						C.G. Jung.

						Each of the four letters of the ENFP code signifies a key personality trait of this type. ENFPs are
						energized by time spent with others (Extraverted), focus on ideas and concepts rather than facts
						and details (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be
						spontaneous and flexible rather than planned and organized (Perceiving).""");

				break;


			case("ISFJ"):
				System.out.println("""
						The ISFJ Personality Type

							Protector
							The Defender(16Personalities)

						ISFJs are industrious caretakers, loyal to traditions and organizations. They are practical,
						compassionate, and caring, and are motivated to provide for others and protect them from the
						perils of life.

						ISFJs are conventional and grounded, and enjoy contributing to established structures of society.
						They are steady and committed workers with a deep sense of responsibility to others. They focus
						on fulfilling their duties, particularly when they are taking care of the needs of other people.
						They want others to know that they are reliable and can be trusted to do what is expected of 
						them. They are conscientious and methodical, and persist until the job is done.

						What does ISFJ stand for
						ISFJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling, Judging. ISFJ indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");
				break;
	
			case("ISFP"):
				System.out.println("""
						The ISFP Personality Type

							Composer
							The Adventurer(16Personalities)				

						ISFPs are gentle caretakers who live in the present moment and enjoy their surroundings with
						cheerful, low-key enthusiasm. They are flexible and spontaneous, and like to go with the flow to
						enjoy what life has to offer. ISFPs are quiet and unassuming, and may be hard to get to know.
						However, to those who know them well, the ISFP is warm and friendly, eager to share in life's
						many experiences.

						ISFPs have a strong aesthetic sense and seek out beauty in their surroundings. They are attuned
						to sensory experience, and often have a natural talent for the arts. ISFPs especially excel at
						manipulating objects, and may wield creative tools like paintbrushes and sculptor's knives with
						great mastery.

						What does ISFP stand for
						ISFP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling, Perceiving. ISFP indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving).""");
				break;


			case("ISTJ"):
				System.out.println("""
						The ISTJ Personality Type
							
							The Inspector
							Logician(16Personalities)							

						ISTJs are responsible organizers, driven to create and enforce order within systems and
						institutions. They are neat and orderly, inside and out, and tend to have a procedure for
						everything they do. Reliable and dutiful, ISTJs want to uphold tradition and follow regulations.

						ISTJs are steady, productive contributors. Although they are Introverted, ISTJs are rarely isolated;
						typical ISTJs know just where they belong in life, and want to understand how they can
						participate in established organizations and systems. They concern themselves with maintaining
						the social order and making sure that standards are met.

						What does ISTJ stand for
						ISTJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking, Judging. ISTJ indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");
				break;

			case("ISTP"):
				System.out.println("""
						The ISTP Personality Type

							Craftsperson							
							The Virtuoso(16Personalities)
				
						ISTPs are observant artisans with an understanding of mechanics and an interest in
						troubleshooting. They approach their environments with a flexible logic, looking for practical
						solutions to the problems at hand. They are independent and adaptable, and typically interact
						with the world around them in a self-directed, spontaneous manner.

						ISTPs are attentive to details and responsive to the demands of the world around them. Because
						of their astute sense of their environment, they are good at moving quickly and responding to
						emergencies. ISTPs are reserved, but not withdrawn: the ISTP enjoys taking action, and
						approaches the world with a keen appreciation for the physical and sensory experiences it has to
						offer.

						What does ISTP stand for
						ISTP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking, Perceiving. ISTP indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving).""");
				break;

			case("ESFJ"):
				System.out.println("""
						The ESFJ Personality Type

							Provider
							The Consul(16Personalities)	

						ESFJs are conscientious helpers, sensitive to the needs of others and energetically dedicated to
						their responsibilities. They are highly attuned to their emotional environment and attentive to
						both the feelings of others and the perception others have of them. ESFJs like a sense of harmony
						and cooperation around them, and are eager to please and provide.

						ESFJs value loyalty and tradition, and usually make their family and friends their top priority.
						They are generous with their time, effort, and emotions. They often take on the concerns of
						others as if they were their own, and will attempt to put their significant organizational talents to
						use to bring order to other people's lives.

						What does ESFJ stand for
						ESFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs
						and Isabel Myers. It stands for Extraverted, Sensing, Feeling, Judging. ESFJ indicates a
						person who is energized by time spent with others (Extraverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");

				break;

			case("ESFP"):
				System.out.println("""
						The ESFP Personality Type

							Performer
							The Entertainer(16Personalities)
				
						ESFPs are vivacious entertainers who charm and engage those around them. They are
						spontaneous, energetic, and fun-loving, and take pleasure in the things around them: food,
						clothes, nature, animals, and especially people.

						ESFPs are typically warm and talkative and have a contagious enthusiasm for life. They like to be
						in the middle of the action and the center of attention. They have a playful, open sense of humor,
						and like to draw out other people and help them have a good time.

						What does ESFP stand for
						ESFP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, Sensing, Feeling, Perceiving. ESFP indicates a
						person who is energized by time spent with others (Extraverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving). """);

				break;

			case("ESTJ"):
				System.out.println("""
						The ESTJ personality type
		
							Supervisor
							Executive(16Personalities)		

						ESTJs are hardworking traditionalists, eager to take charge in organizing projects and people.
						Orderly, rule-abiding, and conscientious, ESTJs like to get things done, and tend to go about
						projects in a systematic, methodical way.

						ESTJs are the consummate organizers, and want to bring structure to their surroundings. They
						value predictability and prefer things to proceed in a logical order. When they see a lack of
						organization, the ESTJ often takes the initiative to establish processes and guidelines, so that
						everyone knows what's expected.

						What does ESTJ stand for
						ESTJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, Sensing, Thinking, Judging. ESTJ indicates a
						person who is energized by time spent with others (Extraverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging). """);
				break;

			case("ESTP"):
				System.out.print("""
						The ESTP personality type
							
							Dynamo
							The Entrepreneur(16Personalities)	

						ESTPs are energetic thrill-seekers who are at their best when putting out fires, whether literal or
						metaphorical. They bring a sense of dynamic energy to their interactions with others and the
						world around them. They assess situations quickly and move adeptly to respond to immediate
						problems with practical solutions.

						Active and playful, ESTPs are often the life of the party and have a good sense of humor. They use
						their keen powers of observation to assess their audience and adapt quickly to keep interactions
						exciting. Although they typically appear very social, they are rarely sensitive; the ESTP prefers to
						keep things fast-paced and silly rather than emotional or serious.

						What does ESTP stand for
						ESTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs
						and Isabel Myers. It stands for Extraverted, Sensing, Thinking, Perceiving. ESTP indicates
						a person who is energized by time spent with others (Extraverted), who focuses on facts and
						details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving).""");

				break;
		}

	}

}