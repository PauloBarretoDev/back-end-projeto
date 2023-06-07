package com.projetao.f1databasebackend.model;

import javax.persistence.*;

@Entity
public class Piloto {

    @Id
    @GeneratedValue
    private Long idPiloto;
    private String foto;
    private String nome;
    private int vitorias;
    private int paisId;
    private int equipeId;

    public Long getIdPiloto() {
        return idPiloto;
    }
    public void setIdPiloto(Long idPiloto) {
        this.idPiloto = idPiloto;
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

    public int getPaisId() {
        return paisId;
    }

    public void setPaisId(int paisId) {
        this.paisId = paisId;
    }

    public int getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(int equipeId) {
        this.equipeId = equipeId;
    }
}
