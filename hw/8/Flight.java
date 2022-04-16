import java.util.ArrayList;
import java.util.GregorianCalendar;

class Flight{
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
public Flight(String getFightNo, GregorianCalendar depatureTime,GregorianCalendar arrivalTime){
    this.flightNo = flightno;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
}
public int getFlightTime(){
    return (int)(arrivalTime.getTimeInMillis()-departureTIme.getTimeInMillis()/60000));
}
public GregorianCalendar getDepartureTIme(){
    return departureTime;
}

public GregorianCalendar getArrivalTime(){
    return arrivalTime;
}

public void setArrivalTime(GregorianCalendar arrivalTime){
    this.arrivalTime = arrivalTime;
}

public void setDepartureTime(GregorianCalendar departureTime){
    this.departureTime = departureTime;

    }

}