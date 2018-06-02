package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "email_cliente", schema = "oficinamecanicapg", catalog = "")
@IdClass(EmailClientePK.class)
public class EmailCliente {
    private int idEmailCliente;
    private String emailCliente;
    private int idCliente;
    private Cliente cliente;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_email_cliente")
    public int getIdEmailCliente() {
        return idEmailCliente;
    }

    public void setIdEmailCliente(int idemailCliente) {
        this.idEmailCliente = idemailCliente;
    }

    @Basic
    @Column(name = "email_cliente")
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Id
    @Column(name = "id_cliente")
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

        if (idEmailCliente != that.idEmailCliente) return false;
        if (idCliente != that.idCliente) return false;
        if (emailCliente != null ? !emailCliente.equals(that.emailCliente) : that.emailCliente != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmailCliente;
        result = 31 * result + (emailCliente != null ? emailCliente.hashCode() : 0);
        result = 31 * result + idCliente;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
