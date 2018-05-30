package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logradouro {
    private int idLogradouro;
    private String logradouro;

    @Id
    @Column(name = "idLogradouro")
    public int getIdLogradouro() {
        return idLogradouro;
    }

    public void setIdLogradouro(int idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    @Basic
    @Column(name = "logradouro")
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Logradouro that = (Logradouro) o;

        if (idLogradouro != that.idLogradouro) return false;
        if (logradouro != null ? !logradouro.equals(that.logradouro) : that.logradouro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLogradouro;
        result = 31 * result + (logradouro != null ? logradouro.hashCode() : 0);
        return result;
    }
}
