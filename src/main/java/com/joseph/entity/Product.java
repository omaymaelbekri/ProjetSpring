package com.joseph.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produit_id")
    private Long produit_id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "quantite")
    private double quantite;

    @Column(name = "prix")
    private double prix;

    @ManyToMany(mappedBy = "products")
    private Set<Commande> commandes = new HashSet<>();

    // Default constructor
    public Product() {
    }

    // Constructor with all fields except id (if you want to set it manually)
    public Product(String designation, double quantite, double prix) {
        this.designation = designation;
        this.quantite = quantite;
        this.prix = prix;
    }

    // Getters
    public Long getProduit_id() {
        return produit_id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    // Setters
    public void setProduit_id(Long produit_id) {
        this.produit_id= produit_id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // toString() method
    @Override
    public String toString() {
        return "Product{" +
                "id=" + produit_id +
                ", designation='" + designation + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}

