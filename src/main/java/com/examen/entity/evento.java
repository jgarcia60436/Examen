package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pubObjetivo;
    private long codPromocionales;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPubObjetivo() {
        return pubObjetivo;
    }

    public void setPubObjetivo(String pubObjetivo) {
        this.pubObjetivo = pubObjetivo;
    }

    public long getCodPromocionales() {
        return codPromocionales;
    }

    public void setCodPromocionales(long codPromocionales) {
        this.codPromocionales = codPromocionales;
    }

}
