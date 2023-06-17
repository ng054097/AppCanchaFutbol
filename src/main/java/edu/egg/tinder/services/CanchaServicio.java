package edu.egg.tinder.services;



import edu.egg.tinder.Repository.CanchasDisponiblesRepository;
import edu.egg.tinder.modelo.Alquiler;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class CanchaServicio {
    @Autowired

    private CanchasDisponiblesRepository canchaRepository;

        public Alquiler GuardarCancha(Alquiler alquiler){
            return this.canchaRepository.save(alquiler);
        }



//    public List filtraPorDiaHorarioFechaYCancha(int dia , int horarioEntrada, int horarioSalida, int idCancha){
//
//        return canchasDisponiblesRepository.class.
//
//                .stream()
//                .filter(disponibilidad1 -> disponibilidad1.getCancha().equals(idCancha))
//                .filter(disponibilidad1 -> disponibilidad1.getHorarioEntrada()==(horarioEntrada))
//                .filter(disponibilidad1 -> disponibilidad1.getHorarioSalida()==(horarioSalida)).collect(Collectors.toList());
//
//
//    }



}


