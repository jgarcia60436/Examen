package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "concierto")
public class concierto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String artista;
    private long costo;
    private String fecha;
    private long capMaxima;
    private String lugar;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private evento evento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(long capMaxima) {
        this.capMaxima = capMaxima;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public evento getEvento() {
        return evento;
    }

    public void setEvento(evento evento) {
        this.evento = evento;
    }

}
