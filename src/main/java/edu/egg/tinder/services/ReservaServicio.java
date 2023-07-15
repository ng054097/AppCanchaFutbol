package edu.egg.tinder.services;





import edu.egg.tinder.Repository.AlquileresRepository;
import edu.egg.tinder.excepcions.ReservaNoDisponibleException;
import edu.egg.tinder.modelo.Reserva;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Data
public class ReservaServicio {
    @Autowired
    private AlquileresRepository alquileresRepository;



        public Reserva guardarAlquiler(Reserva reserva){


            if(alquileresRepository.existsByCanchaAndHorarioEntradaAndHorarioSalidaAndDia
                    (reserva.getCancha(),reserva.getHorarioEntrada(),reserva.getHorarioSalida(),reserva.getDia())){

                throw new ReservaNoDisponibleException("La cancha no está disponible en el horario y fecha especificados.");

            }
        return alquileresRepository.save(reserva);
        }


    @Transactional
        public void borrarAlquiler(Reserva reserva) {
            this.alquileresRepository.deleteByCanchaAndDiaAndAndHorarioEntradaAndHorarioSalida(reserva.getCancha(),reserva.getDia(),reserva.getHorarioEntrada(),reserva.getHorarioSalida());
    }

    public Reserva buscarReserva(Reserva reserva) {
            return this.alquileresRepository.findByNumeroDeCanchaAndDiaAndHorarioEntradaAndHorarioSalida(reserva.getCancha(),reserva.getDia(),reserva.getHorarioEntrada(),reserva.getHorarioSalida());
    }
}


