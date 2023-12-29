package com.joseph.service.Impl;

import java.util.List;

import com.joseph.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joseph.entity.Commande;
import com.joseph.repository.CommandeRepository;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeRepository commandeRepository; // Assuming you have a CommandeRepository

    @Override
    @Transactional
    public List<Commande> getCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCommande(Commande theCommande) {
        commandeRepository.save(theCommande);
    }

    @Override
    @Transactional
    public Commande getCommande(int theId) {
        return commandeRepository.findById(theId).orElse(null);
    }

    @Override
    @Transactional
    public void deleteCommande(int theId) {
        commandeRepository.deleteById(theId);
    }
}

