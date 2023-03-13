package com.slimen.products.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {
	
	private String ref;
	private  int quantie;
	private  float prixUnitaire;

}
