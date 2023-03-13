import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ProductService } from 'src/app/services/product.service';
import { Product } from 'src/app/shared/product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
})
export class ProductComponent implements OnInit {
  products!: Product[];

  produitForm!: FormGroup;

  constructor(private productService: ProductService, private fb: FormBuilder) {
    this.produitForm = this.fb.group({
      ref: ['', Validators.required],
      quantite: [],
      prixUnit: [''],
    });
  }

  ngOnInit(): void {
    this.products = this.productService.getProducts();
  }
}
