package com.joseph.repository;

import com.joseph.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.joseph.entity.Commande;

@Repository("commandeRepository")
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}


