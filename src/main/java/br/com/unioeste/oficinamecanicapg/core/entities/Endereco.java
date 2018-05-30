package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Endereco {
    private int idEndereco;
    private int cep;
    private Bairro bairro;
    private Cidade cidade;
    private Logradouro logradouro;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEndereco")
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    @Basic
    @NotNull
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

    @ManyToOne
    @JoinColumn(name = "idBairro", referencedColumnName = "idBairro", nullable = false)
    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @ManyToOne
    @JoinColumn(name = "idCidade", referencedColumnName = "idCidade", nullable = false)
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @ManyToOne
    @JoinColumn(name = "idLogradouro", referencedColumnName = "idLogradouro", nullable = false)
    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}
