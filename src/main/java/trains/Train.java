package trains;

import java.rmi.server.UID;
import java.util.Random;

public abstract class Train {
    UID uid = new UID();
    int cost;

    abstract public int getCost();

    protected boolean getChance(int chance) {
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        return randInt < chance ? true : false;
    }

    abstract public double getRevenuePerMount();
}
