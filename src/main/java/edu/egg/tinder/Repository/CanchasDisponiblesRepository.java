package edu.egg.tinder.Repository;


import edu.egg.tinder.modelo.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanchasDisponiblesRepository extends JpaRepository<Alquiler, Integer> {



}
