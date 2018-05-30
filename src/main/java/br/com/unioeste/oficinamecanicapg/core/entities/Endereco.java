package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
    private int idEndereco;
    private int cep;

    @Id
    @Column(name = "idEndereco")
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    @Basic
    @Column(name = "CEP")
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        if (idEndereco != endereco.idEndereco) return false;
        if (cep != endereco.cep) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEndereco;
        result = 31 * result + cep;
        return result;
    }
}
