package br.edu.up.venda.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.venda.domain.Venda;

public interface VendaRepository extends CrudRepository<Venda, Long> {
    
}
