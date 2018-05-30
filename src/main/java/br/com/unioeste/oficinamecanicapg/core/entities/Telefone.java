package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefone {
    private int idTelefone;
    private String telefone;

    @Id
    @Column(name = "idTelefone")
    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    @Basic
    @Column(name = "telefone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone1 = (Telefone) o;

        if (idTelefone != telefone1.idTelefone) return false;
        if (telefone != null ? !telefone.equals(telefone1.telefone) : telefone1.telefone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTelefone;
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        return result;
    }
}
