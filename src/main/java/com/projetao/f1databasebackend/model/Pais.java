package com.projetao.f1databasebackend.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Pais {
    @Id
    @GeneratedValue
    private Long idPais;
    private String nome;
    private String foto;

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
