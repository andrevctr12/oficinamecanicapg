package br.com.unioeste.oficinamecanicapg.core.controllers;

import br.com.unioeste.oficinamecanicapg.core.entities.Cliente;
import br.com.unioeste.oficinamecanicapg.core.repositories.ClienteRepository;
import br.com.unioeste.oficinamecanicapg.errors.controllers.ControllerException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;
@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;


    @PostMapping()
    public @ResponseBody Cliente create(@RequestBody Cliente cliente) {
        try {
            return repository.save(cliente);
        }
        catch (RuntimeException e) {
            throw new ControllerException(BAD_REQUEST, e.getMessage());
        }
    }

    @RequestMapping("/{id}")
    @GetMapping(produces = "application/json")
    public @ResponseBody Cliente findOne(@PathVariable int id) {
        Cliente clienteResponse = repository.findOne(id);
        if (clienteResponse == null) {
            throw new ControllerException(NOT_FOUND, "Cliente não encontrado");
        }
        return clienteResponse;
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody List<Cliente> findAll() {
        return repository.findAll();
    }

}
