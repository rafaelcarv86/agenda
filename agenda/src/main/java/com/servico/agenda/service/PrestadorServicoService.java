package com.servico.agenda.service;

import com.servico.agenda.domain.PrestadorServico;
import com.servico.agenda.repository.PrestadorServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestadorServicoService {

    @Autowired
    private PrestadorServicoRepository prestadorServicoRepository;

    public List<PrestadorServico> getAll (){
        return prestadorServicoRepository.findAll();
    }

    public void criar(){
        PrestadorServico prestadorServico = new PrestadorServico(1L, "jose", "Castrador", "44999490006");
        prestadorServicoRepository.save(prestadorServico);
    }

}
