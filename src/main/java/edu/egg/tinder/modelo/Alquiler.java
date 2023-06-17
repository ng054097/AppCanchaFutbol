package edu.egg.tinder.modelo;




import javax.persistence.*;

@Entity
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name="cancha_id")
    private Cancha cancha ;
    @Column
    private  int dia;
    @Column
    private  int horarioEntrada;
    @Column
    private  int horarioSalida;


    @Column
    private  boolean disponible;


    public Alquiler(Long id, Cancha cancha, int dia, int horarioEntrada, int horarioSalida, boolean disponible) {
        this.id = id;
        this.cancha = cancha;
        this.dia = dia;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }








    public Alquiler() {
    }

    public Alquiler(int dia, int horarioEntrada, int horarioSalida, Cancha cancha, boolean disponible) {
        this.dia = dia;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.cancha = cancha;
        this.disponible = disponible;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(int horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public int getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(int horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }


}
