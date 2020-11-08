package com.ixcorp.api.chanchito.repository;

import com.ixcorp.api.chanchito.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente,Long> {

    Cliente findByDni(String dni);
}
