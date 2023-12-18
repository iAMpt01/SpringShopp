package com.controller;
import com.controller.model.Comanda;
import com.controller.service.ComandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComandaController {

    private final ComandaService comandaService;

    @Autowired
    public ComandaController(ComandaService comandaService) {
        this.comandaService = comandaService;
    }

    @PostMapping("/api/comenzi")
    public Comanda salveazaComanda(@RequestBody Comanda comanda) {
        return comandaService.salveazaComanda(comanda);
    }
}
