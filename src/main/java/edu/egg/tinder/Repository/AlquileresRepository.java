package edu.egg.tinder.Repository;


import edu.egg.tinder.Enum.Canchas;
import edu.egg.tinder.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import java.time.LocalTime;

@Repository
public interface AlquileresRepository extends JpaRepository<Reserva, Integer> {

        boolean existsByCanchaAndHorarioEntradaAndHorarioSalidaAndDia(Canchas numeroDeCancha , LocalTime horarioEntrada, LocalTime horarioSalida, LocalDate dia );

        void deleteByCanchaAndDiaAndAndHorarioEntradaAndHorarioSalida(Canchas numeroDeCancha, LocalDate dia , LocalTime horarioEntrada, LocalTime horarioSalida );
        @Query("SELECT r FROM Reserva r WHERE r.cancha = :cancha AND r.dia = :dia AND r.horarioEntrada = :horarioEntrada AND r.horarioSalida = :horarioSalida")
        Reserva findByNumeroDeCanchaAndDiaAndHorarioEntradaAndHorarioSalida(Canchas cancha, LocalDate dia, LocalTime horarioEntrada, LocalTime horarioSalida);
}

