package com.controller;
import com.controller.model.Comanda;
import com.controller.service.ComandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/api/comenzi")
    public List<Comanda> getAllComenzi() {
        return comandaService.getAllComenzi();
    }

    @DeleteMapping("/api/comenzi/{comandaId}")
    public ResponseEntity<String> stergeComanda(@PathVariable Long comandaId) {
        try {
            comandaService.stergeComanda(comandaId);
            return new ResponseEntity<>("Comanda a fost ștearsă cu succes.", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Eroare la ștergerea comenzii.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
