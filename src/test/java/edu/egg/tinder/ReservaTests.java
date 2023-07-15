package edu.egg.tinder;


import edu.egg.tinder.Enum.Canchas;
import edu.egg.tinder.excepcions.ReservaNoDisponibleException;
import edu.egg.tinder.modelo.Reserva;
import edu.egg.tinder.services.ReservaServicio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ReservaTests {
	@Autowired
	private ReservaServicio reservaServicio;

	Reserva reserva = new Reserva();
	Reserva reservaNoGuarda= new Reserva();

	@BeforeEach
	void setUp() {

		//acciones precias
		reserva.setCancha(Canchas.N5);
		reserva.setDia(LocalDate.of(2022, 11, 5));
		reserva.setHorarioSalida(LocalTime.of(15, 00));
		reserva.setHorarioEntrada(LocalTime.of(14, 00));
		reservaServicio.borrarAlquiler(reserva);
		reservaServicio.guardarAlquiler(reserva);

	}

	@AfterEach
	void tearDown() {
		// Acciones de limpieza después de cada prueba (si es necesario)
		reservaServicio.borrarAlquiler(reserva);
		reservaServicio.borrarAlquiler(reservaNoGuarda);

	}
	@Test
	void alQuererRealizarUnaReservaYaCreadaSeLanzaUnaExcepcion() {

		reserva.setCancha(Canchas.N5);
		reserva.setDia(LocalDate.of(2022, 11,5));
		reserva.setHorarioSalida(LocalTime.of(15,00));
		reserva.setHorarioEntrada(LocalTime.of(14,00));

		assertThrows(ReservaNoDisponibleException.class, () -> reservaServicio.guardarAlquiler(reserva));
	}

	@Test
	void alQuererRealizarUnaReservaNoCreadaSeCreaLaReserva() {
		reservaNoGuarda.setCancha(Canchas.N11);
		reservaNoGuarda.setDia(LocalDate.of(2022, 11,5));
		reservaNoGuarda.setHorarioSalida(LocalTime.of(15,00));
		reservaNoGuarda.setHorarioEntrada(LocalTime.of(14,00));

		reservaServicio.guardarAlquiler(reservaNoGuarda);
		Reserva reservaGuardada = this.reservaServicio.buscarReserva(reservaNoGuarda);
		assertEquals(reservaGuardada.getCancha(),Canchas.N11);
	}

}
