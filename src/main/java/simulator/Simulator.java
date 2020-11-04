package simulator;

import trains.Freight;
import trains.Ic;
import trains.PassangerTrain;
import trains.Train;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Simulator {
    List<Train> trains = new LinkedList<Train>();

    Simulator() {
        int passengers;
        Train train;
        for (int i=0;i<RandomGenerator(2,5);i++){
            passengers = RandomGenerator(115, 250);
            train = new PassangerTrain(passengers);
            trains.add(train);
        }

        for (int i=0;i<RandomGenerator(2,5);i++){
            passengers = RandomGenerator(115, 250);
            train = new Ic(passengers);
            trains.add(train);
        }

        for (int i=0;i<RandomGenerator(2,5);i++){
            train = new Freight();
            trains.add(train);
        }
    }

    public int getRevenue() {
        int revenue = 0;
        int years = 2;
        int months = years * 12;

        for (int i = 0; i < months; i++) {
            for (Train train : trains){
                revenue += train.getRevenuePerMount();
                revenue -= train.getCost();
            }
        }

        return revenue;
    }


    public int RandomGenerator(int min, int max) {
        Random rand = new Random();
        int randInt = rand.nextInt(max);
        return randInt + min;
    }
}
