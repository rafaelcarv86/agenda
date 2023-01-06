package com.servico.agenda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PrestadorServico {

    @Id
    private Long id;
    private String nome;
    private String tipoServico;
    private String contato;

    public PrestadorServico() {

    }

    public PrestadorServico(Long id, String nome, String tipoServico, String contato) {
        this.id = id;
        this.nome = nome;
        this.tipoServico = tipoServico;
        this.contato = contato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
