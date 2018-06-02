package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCliente")
    private int idCliente;

    @Basic
    @NotNull
    @Column(name = "nome")
    private String nome;

    @Basic
    @NotNull
    @Column(name = "CPF")
    private String cpf;

    @Basic
    @Column(name = "complemento")
    private String complemento;

    @Basic
    @NotNull
    @Column(name = "numeroEndereco")
    private int numeroEndereco;

    @ManyToOne
    //@JoinColumn(name = "idTelefone", referencedColumnName = "idTelefone", nullable = false)
    private Telefone telefone;

    @ManyToOne
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco", nullable = false)
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente")
    private Collection<EmailCliente> emailCliente;


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Collection<EmailCliente> getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(Collection<EmailCliente> emailCliente) {
        this.emailCliente = emailCliente;
    }
}
