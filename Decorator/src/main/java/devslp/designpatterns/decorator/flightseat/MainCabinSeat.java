package devslp.designpatterns.decorator.flightseat;

public class MainCabinSeat implements FlightSeat {
    @Override
    public String getFacilities() {
        return "Free Food";
    }

    @Override
    public Double getCost() {
        return 500.0;
    }
}
