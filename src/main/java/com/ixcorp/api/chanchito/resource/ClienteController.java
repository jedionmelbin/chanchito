package com.ixcorp.api.chanchito.resource;

import com.ixcorp.api.chanchito.domain.Cliente;
import com.ixcorp.api.chanchito.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;

    @PostMapping(value = "/crear")
    public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente) {

        try {
            boolean validar = clienteService.validarExisteDni(cliente.getDni());
            if (validar){
                return new ResponseEntity<>("El cliente ya fue registrado", HttpStatus.CONFLICT);
            }

            clienteService.insertar(cliente);

        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("Creado existoso", HttpStatus.OK);
    }

    @GetMapping(value = "/listar")
    public List<Cliente> listarCliente() {
        try {

            return clienteService.listarCliente();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

}
