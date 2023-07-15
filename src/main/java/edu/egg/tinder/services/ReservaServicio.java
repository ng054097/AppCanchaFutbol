package edu.egg.tinder.services;





import edu.egg.tinder.Repository.AlquileresRepository;
import edu.egg.tinder.excepcions.ReservaNoDisponibleException;
import edu.egg.tinder.modelo.Reserva;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Data
public class ReservaServicio {
    @Autowired
    private AlquileresRepository alquileresRepository;



        public Reserva GuardarAlquiler(Reserva reserva){


            if(alquileresRepository.existsByCanchaAndHorarioEntradaAndHorarioSalidaAndDia
                    (reserva.getCancha(),reserva.getDia(),reserva.getHorarioEntrada(),reserva.getHorarioSalida())){

                throw new ReservaNoDisponibleException("La cancha no está disponible en el horario y fecha especificados.");

            }
        return alquileresRepository.save(reserva);
        }







}


