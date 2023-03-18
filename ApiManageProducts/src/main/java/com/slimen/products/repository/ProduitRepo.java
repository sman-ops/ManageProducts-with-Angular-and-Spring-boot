package com.slimen.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slimen.products.entities.Produit;

@Repository
public interface ProduitRepo extends JpaRepository<Produit,Long> {

}
