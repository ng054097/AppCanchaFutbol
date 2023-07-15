package edu.egg.tinder.modelo;


import edu.egg.tinder.Enum.Canchas;

import javax.persistence.*;
import java.time.LocalDate;

import java.time.LocalTime;


@Entity(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Canchas cancha;
    @Column
    private LocalDate dia;

    @Column
    private LocalTime horarioEntrada;

    @Column
    private LocalTime horarioSalida;








    public Reserva() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Canchas getCancha() {
        return cancha;
    }

    public void setCancha(Canchas cancha) {
        this.cancha = cancha;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public LocalTime getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(LocalTime horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", cancha=" + cancha +
                ", dia=" + dia +
                ", horarioEntrada=" + horarioEntrada +
                ", horarioSalida=" + horarioSalida +
                '}';
    }
}
