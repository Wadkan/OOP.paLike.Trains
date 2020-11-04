package trains;

public class PassangerTrain extends trainWithPeople {
    public PassangerTrain(int randPassenger) {
        super(randPassenger, 10);
        super.cost = 1000;
    }
}
