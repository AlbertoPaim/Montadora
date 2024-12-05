package com.albertopaim.Arquitetura.montadora.api;

import com.albertopaim.Arquitetura.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/montadora")
public class TesteFabricaController {
    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {

        Carro carro = new HondaHrv(motor);
        return carro.darIgnicao(chave);
    }
}
