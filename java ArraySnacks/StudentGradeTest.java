import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {
	
	private static StudentGrade lagbajaSchools;

	@BeforeEach
	public void setStudentGrades() {

		lagbajaSchools = new StudentGrade();
		
		int[][] studentGrades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};

		lagbajaSchools.setStudentGrades(studentGrades);
		
	}

	@Test
	public void testStudentGradesTotal() {
		
		int expectedOutput = 137;

		int actualOutput = lagbajaSchools.studentGradesTotal(0);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testStudentGradesAverage() {

		double expectedOutput = 72;

		double actualOutput = lagbajaSchools.studentGradesAverage(1);
		
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testStudentPosition() {

		int expectedOutput = 3;
		
		int actualOutput = lagbajaSchools.studentPosition(2);

		assertEquals(expectedOutput, actualOutput);
	
	}

	@Test
	public void testSubjectTotal() {

		int expectedOutput = 336;

		int actualOutput = lagbajaSchools.subjectTotal(0);
		
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testSubjectAverage() {

		double expectedOutput = 50;
	
		double actualOutput = lagbajaSchools.subjectAverage(1);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testNumberOfPasses() {

		int expectedOutput = 2;

		int actualOutput = lagbajaSchools.numberOfPasses(2);
		
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testNumberOfFails() {

		int expectedOutput = 0;

		int actualOutput = lagbajaSchools.numberOfFails(0);

		assertEquals(expectedOutput, actualOutput);
	
	}

	@Test
	public void testHighestSubjectGrade() {

		int expectedOutput = 83; 
		
		int actualOutput = lagbajaSchools.highestSubjectGrade(1);
		
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testHighestSubjectStudent() {

		int expectedOutput = 4;

		int actualOutput = lagbajaSchools.subjectHighestStudent(1);
		
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testLowestSubjectStudent() {

		int expectedOutput = 27;

		int actualOutput = lagbajaSchools.lowestSubjectGrade(2);

		assertEquals(expectedOutput, actualOutput);

	}
	
	@Test
	public void testSubjectLowestStudent() {

		int expectedOutput = 3;

		int actualOutput = lagbajaSchools.subjectLowestStudent(2);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test		
	public void testOverallHighestScore() {
	
		int expectedOutput = 98;

		int actualOutput = lagbajaSchools.overallHighestScore();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testOverallHighestScoreStudent() {

		int expectedOutput = 2;

		int actualOutput = lagbajaSchools.overallHighestScoreStudent();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testOverallHighestScoreSubject() {

		int expectedOutput = 1;

		int actualOutput = lagbajaSchools.overallHighestScoreSubject();

		assertEquals(expectedOutput, actualOutput);

	}
	
	@Test
	public void testOverallLowestScore() {

		int expectedOutput = 21;

		int actualOutput = lagbajaSchools.overallLowestScore();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testOverallLowestScoreStudent() {

		int expectedOutput = 1;

		int actualOutput = lagbajaSchools.overallLowestScoreStudent();
	
		assertEquals(expectedOutput, actualOutput);
		
	}

	@Test
	public void testOverallLowestScoreSubject(){

		int expectedOutput = 2;

		int actualOutput = lagbajaSchools.overallLowestScoreSubject();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testClassTotalScore() {

		int expectedOutput = 734;

		int actualOutput = lagbajaSchools.classTotalScore();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testClassAverageScore() {

		double expectedOutput = 183.5;

		double actualOutput = lagbajaSchools.classAverageScore();
		
		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testBestGraduatingScore() {

		int expectedOutput = 227;

		int actualOutput = lagbajaSchools.bestGraduatingScore();

		assertEquals(expectedOutput, actualOutput);


	}

	@Test
	public void testBestGraduatingStudent() {

		int expectedOutput = 4;

		int actualOutput = lagbajaSchools.bestGraduatingStudent();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testWorstGraduatingScore() {

		int expectedOutput = 137;

		int actualOutput = lagbajaSchools.worstGraduatingScore();
		
		assertEquals(expectedOutput, actualOutput);
	
	}

	@Test
	public void testWorstGraduatingStudent() {

		int expectedOutput = 1;

		int actualOutput = lagbajaSchools.worstGraduatingStudent();

		assertEquals(expectedOutput, actualOutput);


	}

	@Test
	public void testEasiestSubjectPasses() {

		int expectedOutput = 4;

		int actualOutput = lagbajaSchools.easiestSubjectPasses();

		assertEquals(expectedOutput, actualOutput);
	
	}

	@Test
	public void testEasiestSubject() {

		int expectedOutput = 1;

		int actualOutput = lagbajaSchools.easiestSubject();

		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testHardestSubjectFails() {

		int expectedOutput = 2;

		int actualOutput = lagbajaSchools.hardestSubjectFails();

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void testHardestSubject() {

		int expectedOutput = 3;

		int actualOutput = lagbajaSchools.hardestSubject();

		assertEquals(expectedOutput, actualOutput);
	
	}

}	