package com.projetao.f1databasebackend.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Pais {
    @Id
    @GeneratedValue
    private Long id;
    private String nome_pais;
    private String foto_pais;
    @OneToOne(mappedBy = "pais")
    private Piloto piloto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_pais() {
        return nome_pais;
    }

    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }

    public String getFoto_pais() {
        return foto_pais;
    }

    public void setFoto_pais(String foto_pais) {
        this.foto_pais = foto_pais;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
