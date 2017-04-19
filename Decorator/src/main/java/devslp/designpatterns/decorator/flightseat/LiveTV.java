package devslp.designpatterns.decorator.flightseat;

public class LiveTV extends FlightSeatDecorator {
    public LiveTV(FlightSeat flightSeat) {
        super(flightSeat);
    }

    @Override
    public String getFacilities() {
        return this.flightSeat.getFacilities() + "+Live TV";
    }

    @Override
    public Double getCost() {
        return this.flightSeat.getCost() + 5.0;
    }
}
