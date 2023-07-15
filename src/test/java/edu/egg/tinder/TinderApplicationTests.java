package edu.egg.tinder;


import edu.egg.tinder.Controllers.AlquilerController;
import edu.egg.tinder.Enum.Canchas;
import edu.egg.tinder.modelo.Reserva;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;


@SpringBootTest
class TinderApplicationTests {

	@Test
	void contextLoads() {

		AlquilerController alquilerController=new AlquilerController() ;

		Reserva reserva= new Reserva();
		reserva.setCancha(Canchas.N5);
		reserva.setDia(LocalDate.of(2022, 11,5));
		reserva.setHorarioSalida(LocalTime.of(15,00));
		reserva.setHorarioEntrada(LocalTime.of(14,00));

		alquilerController.saveCancha(reserva);

	}

}
