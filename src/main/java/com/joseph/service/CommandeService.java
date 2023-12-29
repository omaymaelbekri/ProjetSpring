package com.joseph.service;

import java.util.List;

import com.joseph.entity.Commande;
// import com.joseph.exception.ResourceNotFoundException;

public interface CommandeService {

    public List<Commande> getCommandes();

    public void saveCommande(Commande theCommande);

    public Commande getCommande(int theId);

    public void deleteCommande(int theId);

}

