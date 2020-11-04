package trains;

import java.util.Random;

public class trainWithPeople extends Train {
    private int cost = 1000;
    private double ticketPrice = 1.5;
    int passangersPerDay;
    int chanceForPunishment;

    trainWithPeople(int randPassenger, int chanceForPunishment) {
        this.chanceForPunishment = chanceForPunishment;
        this.passangersPerDay = randPassenger;
    }


    public double getRevenuePerMount() {
        return 31 * (getTicketsPerDay() + getTicketsPlusPerDay() + getPunishmentsPerDay());
    }

    private boolean getChanceForPunish() {
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        return randInt < chanceForPunishment ? true : false;
    }

    private double getPunishmentsPerDay() {
        boolean chanceForPunish = getChanceForPunish();
        if (chanceForPunish) {
            return Math.round(passangersPerDay * 0.2) * 6;
        } else {
            return 0;
        }
    }


    private double getTicketsPlusPerDay() {
        return Math.round(0.25 * passangersPerDay) * 2;
    }

    private double getTicketsPerDay() {
        return passangersPerDay * ticketPrice;
    }


}
