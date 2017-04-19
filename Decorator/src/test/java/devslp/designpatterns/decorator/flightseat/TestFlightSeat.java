package devslp.designpatterns.decorator.flightseat;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFlightSeat {
    @Test
    public void testWiFiSeat()  {
        FlightSeat flightSeat = new MainCabinSeat();
        flightSeat = new WiFi(flightSeat);
        assertEquals(flightSeat.getCost(), 5010.0, 0.0);
        assertEquals(flightSeat.getFacilities(), "Free Food+WiFi");
    }

    @Test
    public void testTVSeat()  {
        FlightSeat flightSeat = new MainCabinSeat();
        flightSeat = new LiveTV(flightSeat);
        assertEquals(flightSeat.getCost(), 5005.0, 0.0);
        assertEquals(flightSeat.getFacilities(), "Free Food+Live TV");
    }

    @Test
    public void testWiFiTVSeat()  {
        FlightSeat flightSeat = new MainCabinSeat();
        flightSeat = new WiFi(flightSeat);
        flightSeat = new LiveTV(flightSeat);
        assertEquals(flightSeat.getCost(), 5015.0, 0.0);
        assertEquals(flightSeat.getFacilities(), "Free Food+WiFi+Live TV");
    }

    @Test
    public void testTVWiFiSeat()  {
        FlightSeat flightSeat = new MainCabinSeat();
        flightSeat = new LiveTV(flightSeat);
        flightSeat = new WiFi(flightSeat);
        assertEquals(flightSeat.getCost(), 5015.0, 0.0);
        assertEquals(flightSeat.getFacilities(), "Free Food+Live TV+WiFi");
    }
}
