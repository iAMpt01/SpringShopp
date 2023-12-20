package com.controller.service;
import com.controller.model.Comanda;
import com.controller.repository.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collections;
import java.util.List;

@Service
public class ComandaService {

    private final ComandaRepository comandaRepository;

    @Autowired
    public ComandaService(ComandaRepository comandaRepository) {
        this.comandaRepository = comandaRepository;
    }

    @Transactional
    @PostMapping("/api/comenzi")
    public Comanda salveazaComanda(@RequestBody Comanda comanda) {
        try {
            System.out.println("Received request to save order: " + comanda);
            return comandaRepository.save(comanda);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception or log it appropriately
            return null;
        }
    }

    @Transactional(readOnly = true)
    public List<Comanda> getAllComenzi() {
        try {
            return comandaRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception or log it appropriately
            return Collections.emptyList();
        }
    }

    @Transactional
    public void stergeComanda(Long comandaId) {
        comandaRepository.deleteById(comandaId);
    }
}
