package com.servico.agenda.repository;


import com.servico.agenda.domain.PrestadorServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorServicoRepository extends JpaRepository <PrestadorServico, Long> {

}
