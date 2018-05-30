package br.com.unioeste.oficinamecanicapg.core.controllers;

import br.com.unioeste.oficinamecanicapg.core.entities.Cliente;
import br.com.unioeste.oficinamecanicapg.core.repositories.ClienteRepository;
import br.com.unioeste.oficinamecanicapg.errors.controllers.ControllerException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;


    @RequestMapping(method = POST)
    public Cliente create(@RequestBody Cliente cliente) {
        try {
            return repository.save(cliente);
        }
        catch (RuntimeException e) {
            throw new ControllerException(BAD_REQUEST, e.getMessage());
        }
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Cliente findOne(@PathVariable int id) {
        Cliente clienteResponse = repository.findOne(id);
        if (clienteResponse == null) {
            throw new ControllerException(NOT_FOUND, "Cliente não encontrado");
        }
        return clienteResponse;
    }

    @RequestMapping(method = GET)
    public List<Cliente> findAll() {
        return repository.findAll();
    }

}
