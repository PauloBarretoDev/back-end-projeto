package com.projetao.f1databasebackend.model;

import javax.persistence.*;

@Entity
public class Piloto {

    @Id
    @GeneratedValue
    private Long id;
    private String foto;
    private String nome;
    private int vitorias;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pais", referencedColumnName = "id")
    private Pais pais;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_equipe", referencedColumnName = "id")
    private Equipe equipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
