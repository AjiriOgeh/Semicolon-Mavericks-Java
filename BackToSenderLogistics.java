public class BackToSenderLogistics {
    public static int calculateRiderWage(int successfulDeliveries) {
        int riderWageForTheDay = 5000;
        if (successfulDeliveries < 0 || successfulDeliveries > 100) throw new IllegalArgumentException("Invalid number of deliveries.");
        if (successfulDeliveries < 50) riderWageForTheDay = successfulDeliveries * 160 + 5000;
        if (successfulDeliveries >= 50 && successfulDeliveries <= 59) riderWageForTheDay = successfulDeliveries * 200 + 5000;
        if (successfulDeliveries >= 60 && successfulDeliveries <= 69) riderWageForTheDay = successfulDeliveries * 250 + 5000;
        if (successfulDeliveries >= 70) riderWageForTheDay =  successfulDeliveries * 500 + 5000;

        return riderWageForTheDay;
    }
}
