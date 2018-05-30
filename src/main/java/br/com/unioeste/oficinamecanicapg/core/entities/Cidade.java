package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cidade {
    private int idCidade;
    private String nomeCidade;
    private String siglaCidade;

    @Id
    @Column(name = "idCidade")
    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    @Basic
    @Column(name = "nomeCidade")
    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    @Basic
    @Column(name = "siglaCidade")
    public String getSiglaCidade() {
        return siglaCidade;
    }

    public void setSiglaCidade(String siglaCidade) {
        this.siglaCidade = siglaCidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        if (idCidade != cidade.idCidade) return false;
        if (nomeCidade != null ? !nomeCidade.equals(cidade.nomeCidade) : cidade.nomeCidade != null) return false;
        if (siglaCidade != null ? !siglaCidade.equals(cidade.siglaCidade) : cidade.siglaCidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCidade;
        result = 31 * result + (nomeCidade != null ? nomeCidade.hashCode() : 0);
        result = 31 * result + (siglaCidade != null ? siglaCidade.hashCode() : 0);
        return result;
    }
}
