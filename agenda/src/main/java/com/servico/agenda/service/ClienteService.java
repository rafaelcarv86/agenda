package com.servico.agenda.service;

import com.servico.agenda.domain.Cliente;
import com.servico.agenda.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll (){
        return clienteRepository.findAll();
    }

    public void criar(){
        Cliente cliente= new Cliente(1L, "jose", "Rua das Dores 171");
        clienteRepository.save(cliente);
    }


}
