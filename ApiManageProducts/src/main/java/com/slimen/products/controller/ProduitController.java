package com.slimen.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slimen.products.entities.Produit;
import com.slimen.products.service.IProduitService;




@RestController
@RequestMapping("/api/produit")
public class ProduitController {
	
	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public  ResponseEntity<List<Produit>> getProduits(){
		List<Produit> produits =produitService.getProduits()
;		return new  ResponseEntity<>(produits,HttpStatus.OK);		
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Produit> addProduit(@RequestBody Produit produit) {
        Produit  newProduit =produitService.addProduit(produit);
        
		return new  ResponseEntity<>(newProduit,HttpStatus.CREATED);
	}
	
	
	
	@PutMapping
	public ResponseEntity<Produit> updateProduit(@RequestBody Produit produit) {
         Produit updateProduit = produitService.updateProduit(produit);
		return new  ResponseEntity<>(updateProduit,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduit(id);
	}

}
