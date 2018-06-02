package br.com.unioeste.oficinamecanicapg.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tipo_logradouro", schema = "oficinamecanicapg", catalog = "")
public class TipoLogradouro {
    private int idTipoLogradouro;
    private String nomeTipo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_lougradouro")
    public int getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(int idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    @Basic
    @NotNull
    @Column(name = "nome_tipo")
    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoLogradouro that = (TipoLogradouro) o;

        if (idTipoLogradouro != that.idTipoLogradouro) return false;
        if (nomeTipo != null ? !nomeTipo.equals(that.nomeTipo) : that.nomeTipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoLogradouro;
        result = 31 * result + (nomeTipo != null ? nomeTipo.hashCode() : 0);
        return result;
    }
}
