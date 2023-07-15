package edu.egg.tinder.Repository;


import edu.egg.tinder.Enum.Canchas;
import edu.egg.tinder.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import java.time.LocalTime;

@Repository
public interface AlquileresRepository extends JpaRepository<Reserva, Integer> {

        boolean existsByCanchaAndHorarioEntradaAndHorarioSalidaAndDia(Canchas numeroDeCancha, LocalDate dia , LocalTime horarioEntrada, LocalTime horarioSalida );
}

