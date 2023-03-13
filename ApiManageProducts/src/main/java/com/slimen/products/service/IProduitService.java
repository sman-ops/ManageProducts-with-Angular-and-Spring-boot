package com.slimen.products.service;

import java.util.List;

import com.slimen.products.entities.Produit;

public interface IProduitService {
	
	List<Produit> getProduits();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(String ref);
	

}
