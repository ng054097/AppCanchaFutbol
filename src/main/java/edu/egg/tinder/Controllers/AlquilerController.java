package edu.egg.tinder.Controllers;



import edu.egg.tinder.modelo.Alquiler;
import edu.egg.tinder.services.CanchaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cancha")
public class AlquilerController {

    @Autowired
    private CanchaServicio canchaServicio;

    @PostMapping
    public Alquiler saveCancha(@RequestBody Alquiler alquiler){
        return canchaServicio.GuardarCancha(alquiler);

    }




}
