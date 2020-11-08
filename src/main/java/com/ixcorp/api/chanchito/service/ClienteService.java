package com.ixcorp.api.chanchito.service;

import com.ixcorp.api.chanchito.domain.Cliente;
import com.ixcorp.api.chanchito.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;


    public Cliente insertar(Cliente cliente) {
        try {

            clienteRepository.save(cliente);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean validarExisteDni(String dni) {
        try {

            Cliente cliente = clienteRepository.findByDni(dni);
            if (cliente != null) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public boolean validarFechaNacimientoReniec(Date dni) {
        try {

            return  true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public List<Cliente> listarCliente() {

        try {
            List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();

            return clientes;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
