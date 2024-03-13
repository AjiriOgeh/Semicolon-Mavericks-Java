
import java.util.Scanner;

public class EasyCycleApp {

    public static void main(String[] args) {

        EasyCycle herCycle = new EasyCycle();
        displayCycle(herCycle);

    }
    public static void displayCycle(EasyCycle easyCycle) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hello, what is your name?: ");
        String name = input.nextLine();

        easyCycle.setName(name);

        System.out.println();

        System.out.println("""
                            Disclaimer: This app predicts your menstrual cycle
                            based on the information provided by you.
                            
                            For accurate guidance on your menstrual cycle and reproductive health,
                            please consult a healthcare professional.""");

        System.out.println();

        System.out.printf("Hi %s,%n", easyCycle.getName());

        try {

            System.out.print("How many days has it been since your last menstrual period began?: ");
            int daysSinceLastPeriod = input.nextInt();

            easyCycle.setDaysSinceLastPeriod(daysSinceLastPeriod);

            try {

                System.out.print("On average, how many days does your menstrual cycle typically last?: ");
                int lengthOfCycle = input.nextInt();

                easyCycle.setLengthOfCycle(lengthOfCycle);

                try {

                    System.out.print("What is the average number of days of your menstrual period?: ");
                    int lengthOfPeriod = input.nextInt();

                    easyCycle.setLengthOfPeriod(lengthOfPeriod);
                    System.out.println();

                    System.out.printf("Period in %d days time%n", easyCycle.getNumberOfDaysToNextPeriod());
                    System.out.printf("-Your next period will likely start on %s and end on %s%n", easyCycle.getNextPeriodDate(), easyCycle.getLastPeriodDate());
                    System.out.printf("-Next ovulation date is on %s%n", easyCycle.getOvulationDate());
                    System.out.printf("-Best chance of getting pregnant is between %s to %s%n", easyCycle.getFirstFertileDate(), easyCycle.getLastFertileDate());
                    System.out.printf("-Your safe window is between %s to %s%n", easyCycle.getSafePeriodFirstDate(), easyCycle.getSafePeriodLastDate());

                    System.out.println();

                    System.out.printf("%s's Cycle%n", easyCycle.getName());
                    System.out.printf("""
                                        Menstrual Cycle length :- %d :: Regular
                                        -Your menstrual cycle is within the average : 21 - 35 days%n""", easyCycle.getLengthOfCycle());
                    System.out.printf("""
                                        Menstrual Period length :- %d :: Regular
                                        -Your menstrual period length is within the average : 2 - 7 days%n""", easyCycle.getLengthOfPeriod());

                }
                catch  (IllegalArgumentException e){
                    System.out.printf("%s%n", e.getMessage());

                }
            }
            catch (IllegalArgumentException e){
                System.out.printf("%s%n", e.getMessage());
            }
        }
        catch (IllegalArgumentException e) {
            System.out.printf("%s%n", e.getMessage());
        }

    }

}