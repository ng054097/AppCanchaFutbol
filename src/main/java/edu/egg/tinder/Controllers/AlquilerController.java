package edu.egg.tinder.Controllers;



import edu.egg.tinder.excepcions.ReservaNoDisponibleException;
import edu.egg.tinder.modelo.Reserva;
import edu.egg.tinder.services.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/cancha")
public class AlquilerController {

    @Autowired
    private final ReservaServicio reservaServicio=new ReservaServicio();

    @PostMapping
    public void saveCancha(@RequestBody Reserva alquiler){
        try{
            reservaServicio.GuardarAlquiler(alquiler);
            ResponseEntity.status(HttpStatus.CREATED).body("Reserva Exitosa");
        }
        catch (ReservaNoDisponibleException e){
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }


    }






}
