package com.alura.desafio_gerador_frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String frase;

    private String personagem;

    private String poster;

    public Long getId() {
        return id;
    }

    public Frase setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Frase setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getFrase() {
        return frase;
    }

    public Frase setFrase(String frase) {
        this.frase = frase;
        return this;
    }

    public String getPersonagem() {
        return personagem;
    }

    public Frase setPersonagem(String personagem) {
        this.personagem = personagem;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public Frase setPoster(String poster) {
        this.poster = poster;
        return this;
    }
}
