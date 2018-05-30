package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EmailClientePK implements Serializable {
    private int idEmailCliente;
    private int idCliente;

    @Column(name = "idEmailCliente")
    @Id
    public int getIdEmailCliente() {
        return idEmailCliente;
    }

    public void setIdEmailCliente(int idemailCliente) {
        this.idEmailCliente = idemailCliente;
    }

    @Column(name = "idCliente")
    @Id
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailClientePK that = (EmailClientePK) o;

        if (idEmailCliente != that.idEmailCliente) return false;
        if (idCliente != that.idCliente) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmailCliente;
        result = 31 * result + idCliente;
        return result;
    }
}
