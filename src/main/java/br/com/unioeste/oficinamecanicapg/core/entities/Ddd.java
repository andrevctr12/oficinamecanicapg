package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ddd {
    private int idDdd;

    @Id
    @Column(name = "idDDD")
    public int getIdDdd() {
        return idDdd;
    }

    public void setIdDdd(int idDdd) {
        this.idDdd = idDdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ddd ddd = (Ddd) o;

        if (idDdd != ddd.idDdd) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idDdd;
    }
}
