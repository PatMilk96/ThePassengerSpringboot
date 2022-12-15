package ie.atu.PassengerSpringboot;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers(){
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Patryk", "123456789098", "0877653351", 20),
                new Passenger("Mr", "David", "0985324732921", "0859123809", 38),
                new Passenger("Mr", "Michel", "764214370326", "0895021084", 52));
        return myPassengers;
    }

    public Passenger getPassenger(@PathVariable String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Owen", "163467895438", "0877653351", 29);
        return myPassenger;
    }
}
