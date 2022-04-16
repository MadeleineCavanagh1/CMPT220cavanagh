import java.util.ArrayList;
import java.util.GregorianCalendar;

class Itinerary{
    private ArrayList<Flight> flights;
    public Itinerary(ArrayList<Flight>flights){
        this.flights = flights;
    }
    public int getTotalTravelTime(){
        int totalTime = getTotalFlightTime();
        for (int i = 0; i < flights.size() - 1;i++){
            long time =flights.get(i + 1).getDepartureTime().getTimeInMillis()-flights.get(i).getArrivalTime().getTimeInMillis();
            totalTime += (int)time / 60000;
        }
        return totalTime;
    }
    public int getTotalFlightTime(){
        int flightTime = 0;
        for(Flight flight: flights)
        flightTime += flight.getFlightTime();
        return flightTime;
    }
}