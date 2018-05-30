package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "email_cliente", schema = "oficinamecanicapg", catalog = "")
@IdClass(EmailClientePK.class)
public class EmailCliente {
    private int idemailCliente;
    private String emailCliente;
    private int idCliente;
    private Cliente clienteByIdCliente;

    @Id
    @Column(name = "idemailCliente")
    public int getIdemailCliente() {
        return idemailCliente;
    }

    public void setIdemailCliente(int idemailCliente) {
        this.idemailCliente = idemailCliente;
    }

    @Basic
    @Column(name = "emailCliente")
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Id
    @Column(name = "idCliente")
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

        EmailCliente that = (EmailCliente) o;

        if (idemailCliente != that.idemailCliente) return false;
        if (idCliente != that.idCliente) return false;
        if (emailCliente != null ? !emailCliente.equals(that.emailCliente) : that.emailCliente != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idemailCliente;
        result = 31 * result + (emailCliente != null ? emailCliente.hashCode() : 0);
        result = 31 * result + idCliente;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente", nullable = false)
    public Cliente getClienteByIdCliente() {
        return clienteByIdCliente;
    }

    public void setClienteByIdCliente(Cliente clienteByIdCliente) {
        this.clienteByIdCliente = clienteByIdCliente;
    }
}
