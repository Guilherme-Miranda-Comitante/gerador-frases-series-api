package com.alura.desafio_gerador_frases.controller;

import com.alura.desafio_gerador_frases.DTO.FraseDTO;
import com.alura.desafio_gerador_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }
}
