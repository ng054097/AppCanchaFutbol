package edu.egg.tinder;

import edu.egg.tinder.Controllers.AlquilerController;
import edu.egg.tinder.Enum.Canchas;
import edu.egg.tinder.modelo.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.time.LocalTime;



@SpringBootApplication
public class TinderApplication {



	public static void main(String[] args) {
		SpringApplication.run(TinderApplication.class, args);



	}

}
