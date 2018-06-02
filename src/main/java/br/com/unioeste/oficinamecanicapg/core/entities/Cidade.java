package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCidade")
    private int idCidade;

    @Basic
    @Column(name = "nomeCidade")
    @NotNull
    private String nomeCidade;

    @Basic
    @Column(name = "siglaCidade")
    private String siglaCidade;

    @ManyToOne
    private Uf uf;

    @OneToMany(mappedBy = "cidade")
    private Collection<Endereco> enderecos;


    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSiglaCidade() {
        return siglaCidade;
    }

    public void setSiglaCidade(String siglaCidade) {
        this.siglaCidade = siglaCidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        if (idCidade != cidade.idCidade) return false;
        if (nomeCidade != null ? !nomeCidade.equals(cidade.nomeCidade) : cidade.nomeCidade != null) return false;
        if (siglaCidade != null ? !siglaCidade.equals(cidade.siglaCidade) : cidade.siglaCidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCidade;
        result = 31 * result + (nomeCidade != null ? nomeCidade.hashCode() : 0);
        result = 31 * result + (siglaCidade != null ? siglaCidade.hashCode() : 0);
        return result;
    }


    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
