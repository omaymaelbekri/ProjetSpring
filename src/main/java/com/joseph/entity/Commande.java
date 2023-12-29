package com.joseph.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commande_id")
    private Long commandeId;

    @Column(name = "date_commande")
    private Date dateCommande;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "commande_product",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private Set<Product> products = new HashSet<>();

    // Default constructor
    public Commande() {
    }

    // Constructor with all fields
    public Commande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    // Getters and Setters
    public Long getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(Long commandeId) {
        this.commandeId = commandeId;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    // Add a product to the set


    // toString() method
    @Override
    public String toString() {
        return "Commande{" +
                "commandeId=" + commandeId +
                ", dateCommande=" + dateCommande +
                ", products=" + products +
                '}';
    }
}
