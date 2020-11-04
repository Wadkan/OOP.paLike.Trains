package trains;

public class Freight extends Train {
    private boolean goAbroad;

    public Freight(){
        super.cost = 1000;
        this.goAbroad = super.getChance(35);
    }

    private double getExtraRevenueIfGoAbroad() {
        boolean goAbroad = super.getChance(35);
        if (goAbroad) {
            return 110;
        } else {
            return 0;
        }
    }

    public int getCost() {
        return cost;
    }

    @Override
    public double getRevenuePerMount() {
        return 550 + getExtraRevenueIfGoAbroad();
    }


}
