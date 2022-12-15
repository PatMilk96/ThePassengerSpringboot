package ie.atu.PassengerSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="/api/passenger")
public class PassengerSpringbootApplication {
	PassengerService myService;

	public PassengerSpringbootApplication(PassengerService myService) {
		this.myService = myService;
	}
	public static void main(String[] args) {
		SpringApplication.run(PassengerSpringbootApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){
		return myService.getPassengers();
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		return myService.getPassenger(passengerID);
	}

}
