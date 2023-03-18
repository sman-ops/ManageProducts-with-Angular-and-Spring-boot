package com.slimen.products.service;

import java.util.List;

import com.slimen.products.entities.Produit;

public interface IProduitService {
	
	List<Produit> getProduits();
	
	Produit addProduit(Produit produit);
	
	Produit updateProduit(Produit produit);
	
	void deleteProduit(Long id);
	

}
