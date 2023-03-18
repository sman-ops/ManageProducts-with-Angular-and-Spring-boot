package com.slimen.products.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="produit")
public class Produit {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String ref;
	private  int quantie;
	private  float prixUnitaire;

}
