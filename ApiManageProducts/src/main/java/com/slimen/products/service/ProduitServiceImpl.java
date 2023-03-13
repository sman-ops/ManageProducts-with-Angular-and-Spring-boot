package com.slimen.products.service;

import java.util.ArrayList;
import java.util.List;

import com.slimen.products.entities.Produit;

public class ProduitServiceImpl implements IProduitService {
	
	
	
	private List<Produit> produits;
	
	public ProduitServiceImpl() {
		produits= new ArrayList<Produit>();
		produits.add(new Produit("livre",39,33));
		produits.add(new Produit("Style",3,33));
		produits.add(new Produit("tablette",39,63));
		
	}
	
	

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		
		produits.remove(produit);
		produits.add(produit);
		
		
		
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit=new Produit();
		produit.setRef(ref);
		produits.remove(produit);
		
	}

}
