package devslp.designpatterns.decorator.FlightSeatExample;

public class MainCabinSeat implements FlightSeat {
    @Override
    public String getFacilities() {
        return "Free Food";
    }

    @Override
    public Double getCost() {
        return 5000.0;
    }
}
