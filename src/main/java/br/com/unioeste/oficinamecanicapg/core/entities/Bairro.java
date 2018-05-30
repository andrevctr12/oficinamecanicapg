package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBairro")
    private int idBairro;

    @Basic
    @Column(name = "nomeBairro")
    @NotNull
    private String nomeBairro;


    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bairro bairro = (Bairro) o;

        if (idBairro != bairro.idBairro) return false;
        if (nomeBairro != null ? !nomeBairro.equals(bairro.nomeBairro) : bairro.nomeBairro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBairro;
        result = 31 * result + (nomeBairro != null ? nomeBairro.hashCode() : 0);
        return result;
    }
}
