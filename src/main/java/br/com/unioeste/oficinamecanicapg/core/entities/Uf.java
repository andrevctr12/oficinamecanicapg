package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Uf {
    private String siglaUf;
    private String nomeUf;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sigla_uf")
    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    @Basic
    @NotNull
    @Column(name = "nome_uf")
    public String getNomeUf() {
        return nomeUf;
    }

    public void setNomeUf(String nomeUf) {
        this.nomeUf = nomeUf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uf uf = (Uf) o;

        if (siglaUf != null ? !siglaUf.equals(uf.siglaUf) : uf.siglaUf != null) return false;
        if (nomeUf != null ? !nomeUf.equals(uf.nomeUf) : uf.nomeUf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = siglaUf != null ? siglaUf.hashCode() : 0;
        result = 31 * result + (nomeUf != null ? nomeUf.hashCode() : 0);
        return result;
    }
}
