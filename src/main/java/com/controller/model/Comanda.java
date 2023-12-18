package com.controller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comanda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String produse;
    private Double total;

    // Constructori
    public Comanda() {
        // Constructor gol necesar pentru JPA
    }

    public Comanda(String email, String produse, Double total) {
        this.email = email;
        this.produse = produse;
        this.total = total;
    }

    // Getteri și setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProduse() {
        return produse;
    }

    public void setProduse(String produse) {
        this.produse = produse;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
