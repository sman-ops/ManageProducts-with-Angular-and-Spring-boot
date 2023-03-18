package com.slimen.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slimen.products.entities.Produit;
import com.slimen.products.repository.ProduitRepo;

@Service
public class ProduitServiceImpl implements IProduitService {
	
   @Autowired
   private ProduitRepo produitRepo;

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produitRepo.findAll();
	}

	@Override
	public Produit addProduit(Produit produit) {
		return produitRepo.save(produit);
		
	}

	@Override
	public Produit updateProduit(Produit produit) {
		
		 return produitRepo.save(produit);
		
		
		
	}

	@Override
	public void deleteProduit(String ref) {
		produitRepo.deleteById(ref);
		
	}

}
