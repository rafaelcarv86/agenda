package com.servico.agenda.controller;

import com.servico.agenda.domain.PrestadorServico;
import com.servico.agenda.service.PrestadorServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrestadorServicoController {

    @Autowired
    private PrestadorServicoService prestadorServicoService;

    @GetMapping("/prestadores")
    public ResponseEntity<Object> getAll(){

        List<PrestadorServico> prestadores = prestadorServicoService.getAll();
        return new ResponseEntity<>(prestadores, HttpStatus.OK);

    }

    @PostMapping("/prestadores/criar")
    public ResponseEntity<Object> criar(){

        prestadorServicoService.criar();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
