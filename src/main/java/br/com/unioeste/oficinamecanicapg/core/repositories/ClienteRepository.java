package br.com.unioeste.oficinamecanicapg.core.repositories;

import br.com.unioeste.oficinamecanicapg.core.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByIdCliente(int idCliente);
}
