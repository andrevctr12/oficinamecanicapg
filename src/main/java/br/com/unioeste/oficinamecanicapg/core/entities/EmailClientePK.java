package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EmailClientePK implements Serializable {
    private int idemailCliente;
    private int idCliente;

    @Column(name = "idemailCliente")
    @Id
    public int getIdemailCliente() {
        return idemailCliente;
    }

    public void setIdemailCliente(int idemailCliente) {
        this.idemailCliente = idemailCliente;
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

        if (idemailCliente != that.idemailCliente) return false;
        if (idCliente != that.idCliente) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idemailCliente;
        result = 31 * result + idCliente;
        return result;
    }
}
