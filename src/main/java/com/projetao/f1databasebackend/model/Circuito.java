package com.projetao.f1databasebackend.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Circuito {

    @Id
    @GeneratedValue
    private Long id;
    private String nome_circuito;
    private Date data_circuito;
    private String vencedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_circuito() {
        return nome_circuito;
    }

    public void setNome_circuito(String nome_circuito) {
        this.nome_circuito = nome_circuito;
    }

    public Date getData_circuito() {
        return data_circuito;
    }

    public void setData_circuito(Date data_circuito) {
        this.data_circuito = data_circuito;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
}
