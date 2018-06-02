package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;

@Entity
public class Ddd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ddd")
    private int idDdd;

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
