package com.controller.repository;

import com.controller.model.Comanda;
import com.controller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComandaRepository extends JpaRepository<Comanda, Long> {


}