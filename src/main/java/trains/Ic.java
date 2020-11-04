package trains;

public class Ic extends trainWithPeople {
    Ic(int randPassenger) {
        super(randPassenger, 8);
        setTicketPrice(0.5);
        super.cost = 1200;
    }
}
