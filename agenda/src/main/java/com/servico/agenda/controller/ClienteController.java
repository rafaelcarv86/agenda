package com.servico.agenda.controller;

import com.servico.agenda.domain.Cliente;
import com.servico.agenda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<Object> getAll() {

        List<Cliente> clientes = clienteService.getAll();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }
    @PostMapping("/clientes/criar")
    public ResponseEntity<Object> criar(){

        clienteService.criar();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
