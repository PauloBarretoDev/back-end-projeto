package com.projetao.f1databasebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Circuito {

    @Id
    @GeneratedValue
    private Long idCircuito;
    private String nome;
    private Date data;
    private String vencedor;

    public Long getIdCircuito() {
        return idCircuito;
    }

    public void setIdCircuito(Long idCircuito) {
        this.idCircuito = idCircuito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
}
