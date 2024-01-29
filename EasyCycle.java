import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
public class EasyCycle {
    private String name;
    private int daysSinceLastPeriod;
    private int lengthOfCycle;
    private int lengthOfPeriod;
    private static final LocalDate localDate = LocalDate.now();
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd yyy");
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDaysSinceLastPeriod(int daysSinceLastPeriod) {
        if(daysSinceLastPeriod < 0 || daysSinceLastPeriod > 35) {
           throw new IllegalArgumentException("You need to see a doctor");
        }
        this.daysSinceLastPeriod = daysSinceLastPeriod;
    }
    public int getDaysSinceLastPeriod() {
        return daysSinceLastPeriod;
    }
    public void setLengthOfCycle(int lengthOfCycle) {
        if(lengthOfCycle < 21 || lengthOfCycle > 35) {
            throw new IllegalArgumentException("You need to see a doctor");
        }

        this.lengthOfCycle = lengthOfCycle;
    }
    public int getLengthOfCycle() {
        return lengthOfCycle;
    }
    public void setLengthOfPeriod(int lengthOfPeriod) {
        if(lengthOfPeriod < 2 || lengthOfPeriod > 7) {
            throw new IllegalArgumentException("You need to see a doctor");
        }
        this.lengthOfPeriod = lengthOfPeriod;
    }
    public int getLengthOfPeriod() {
        return lengthOfPeriod;
    }
    public int getNumberOfDaysToNextPeriod() {
        int numberOfDaysToNextPeriod = lengthOfCycle - daysSinceLastPeriod;
        return numberOfDaysToNextPeriod;
    }
    public String getNextPeriodDate() {
        String nextPeriodDate = localDate.plusDays(lengthOfCycle - daysSinceLastPeriod + 1).format(dateFormat);
        return nextPeriodDate;
    }
    public String getLastPeriodDate() {
        String lastPeriodDate = localDate.plusDays(lengthOfCycle - daysSinceLastPeriod + lengthOfPeriod).format(dateFormat);
        return lastPeriodDate;
    }
    public String getOvulationDate() {
        String ovulationDate = localDate.plusDays((lengthOfCycle * 2L) - daysSinceLastPeriod - 14).format(dateFormat);
        return ovulationDate;
    }
    public String getSafePeriodFirstDate() {
        String safePeriodFirstDate = localDate.plusDays((lengthOfCycle * 2L) - daysSinceLastPeriod - 11).format(dateFormat);
        return safePeriodFirstDate;
    }
    public String getSafePeriodLastDate() {
        String safePeriodLastDate = localDate.plusDays((lengthOfCycle * 2L) - daysSinceLastPeriod).format(dateFormat);
        return safePeriodLastDate;
    }
    public String getFirstFertileDate() {
        String firstFertileDate =localDate.plusDays((lengthOfCycle * 2L) - daysSinceLastPeriod - 19).format(dateFormat);
        return firstFertileDate;
    }
    public String getLastFertileDate() {
        String lastFertileDate = localDate.plusDays((lengthOfCycle * 2L) - daysSinceLastPeriod - 12).format(dateFormat);
        return lastFertileDate;
    }

}