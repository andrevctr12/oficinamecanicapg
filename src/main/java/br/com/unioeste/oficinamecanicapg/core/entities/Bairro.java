package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;

@Entity
public class Bairro {
    private int idBairro;
    private String nomeBairro;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBairro")
    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    @Basic
    @Column(name = "nomeBairro")
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
