package com.alura.desafio_gerador_frases.service;

import com.alura.desafio_gerador_frases.DTO.FraseDTO;
import com.alura.desafio_gerador_frases.model.Frase;
import com.alura.desafio_gerador_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;


    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
