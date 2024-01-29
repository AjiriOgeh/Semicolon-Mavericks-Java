import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class EasyCycleTest {
    private EasyCycle herCycle;

    @BeforeEach
    void testSetEasyCycleInstanceVariableMethods() {

        herCycle = new EasyCycle();

        assertThrows(IllegalArgumentException.class, () -> herCycle.setDaysSinceLastPeriod(40));
        herCycle.setDaysSinceLastPeriod(15);

        assertThrows(IllegalArgumentException.class, () -> herCycle.setLengthOfCycle(20));
        herCycle.setLengthOfCycle(28);

        assertThrows(IllegalArgumentException.class, () -> herCycle.setLengthOfPeriod(10));
        herCycle.setLengthOfPeriod(5);

    }
    @Test
    void testGetName() {

        String expectedOutput = "Jane Doe";
        herCycle.setName("Jane Doe");
        String actualOutput = herCycle.getName();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testGetNextPeriodDate() {

        String expectedOutput = "February 12 2024";
        String actualOutput = herCycle.getNextPeriodDate();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testGetLastPeriodDate() {

        String expectedOutput = "February 16 2024";
        String actualOutput = herCycle.getLastPeriodDate();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void testGetOvulationDate() {

        String expectedOutput = "February 25 2024";
        String actualOutput = herCycle.getOvulationDate();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void testGetSafePeriodFirstDate() {

        String expectedOutput = "February 28 2024";
        String actualOutput = herCycle.getSafePeriodFirstDate();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void testGetSafePeriodLastDate() {

        String expectedOutput = "March 10 2024";
        String actualOutput = herCycle.getSafePeriodLastDate();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void testGetFirstFertileDate() {

        String expectedOutput = "February 20 2024";
        String actualOutput = herCycle.getFirstFertileDate();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void testGetLastFertileDate() {

        String expectedOutput = "February 27 2024";
        String actualOutput = herCycle.getLastFertileDate();
        assertEquals(expectedOutput, actualOutput);

    }
    
}