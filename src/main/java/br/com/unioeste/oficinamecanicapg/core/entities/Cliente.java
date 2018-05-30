package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String complemento;
    private int numeroEndereco;
    private Telefone telefone;
    private Endereco endereco;
    private Collection<EmailCliente> emailCliente;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCliente")
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "CPF")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Basic
    @Column(name = "complemento")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Basic
    @Column(name = "numeroEndereco")
    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (idCliente != cliente.idCliente) return false;
        if (numeroEndereco != cliente.numeroEndereco) return false;
        if (nome != null ? !nome.equals(cliente.nome) : cliente.nome != null) return false;
        if (cpf != null ? !cpf.equals(cliente.cpf) : cliente.cpf != null) return false;
        if (complemento != null ? !complemento.equals(cliente.complemento) : cliente.complemento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCliente;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (complemento != null ? complemento.hashCode() : 0);
        result = 31 * result + numeroEndereco;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idTelefone", referencedColumnName = "idTelefone", nullable = false)
    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @ManyToOne
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco", nullable = false)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @OneToMany(mappedBy = "cliente")
    public Collection<EmailCliente> getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(Collection<EmailCliente> emailCliente) {
        this.emailCliente = emailCliente;
    }
}
