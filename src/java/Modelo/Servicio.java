package Modelo;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Servicio {
    int id;
    String nom;
    String descrip;
    BigDecimal precio;
    LocalTime duracion;

    public Servicio() {
    }

    public Servicio(String nom, String descrip, BigDecimal precio, LocalTime duracion) {
        this.nom = nom;
        this.descrip = descrip;
        this.precio = precio;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    
}
