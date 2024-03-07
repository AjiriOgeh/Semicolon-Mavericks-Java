import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BackToSenderLogisticsTest {

    @Test
    public void riderWageWhenSuccessfulDeliveriesIsLessThan50Test(){
        int successfulDeliveries = 30;
        int expectedOutput = 9800;
        int actualOutput = BackToSenderLogistics.calculateRiderWage(successfulDeliveries);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void riderWageWhenSuccessfulDeliveriesIsBetween50To59Test() {
        int successfulDeliveries = 50;
        int expectedOutput = 15000;
        int actualOutput = BackToSenderLogistics.calculateRiderWage(successfulDeliveries);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void riderWageWhenSuccessfulDeliveriesIsBetween60To69Test(){
        int successfulDeliveries = 60;
        int expectedOutput = 20000;
        int actualOutput = BackToSenderLogistics.calculateRiderWage(successfulDeliveries);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void riderWageWhenSuccessfulDeliveriesIsAboveOrEqualTo70Test() {
        int successfulDeliveries = 80;
        int expectedOutput = 45000;
        int actualOutput = BackToSenderLogistics.calculateRiderWage(successfulDeliveries);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSuccessfulDeliveriesCannotBeNegative() {
        int successfulDeliveries = -1;
        assertThrows(IllegalArgumentException.class, ()->BackToSenderLogistics.calculateRiderWage(successfulDeliveries));
    }

    @Test
    public void testSuccessfulDeliveriesCannotBeMoreThan100() {
        int successfulDeliveries= 101;
        assertThrows(IllegalArgumentException.class, ()->BackToSenderLogistics.calculateRiderWage(successfulDeliveries));

    }

}
