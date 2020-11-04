package trains;

public class trainWithPeople extends Train {
    private double ticketPrice = 1.5;
    int passangersPerDay;
    int chanceForPunishment;

    trainWithPeople(int randPassenger, int chanceForPunishment) {
        this.chanceForPunishment = chanceForPunishment;
        this.passangersPerDay = randPassenger;
    }

    public void setTicketPrice(double extraPriceToAdd){
        this.ticketPrice += extraPriceToAdd;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public double getRevenuePerMount() {
        return 31 * (getTicketsPerDay() + getTicketsPlusPerDay() + getPunishmentsPerDay());
    }


    private double getPunishmentsPerDay() {
        boolean chanceForPunish = super.getChance(chanceForPunishment);
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
