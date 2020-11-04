package trains;

public class PassangerTrain extends trainWithPeople {
    PassangerTrain(int randPassenger) {
        super(randPassenger, 10);
        super.cost = 1000;
    }
}
