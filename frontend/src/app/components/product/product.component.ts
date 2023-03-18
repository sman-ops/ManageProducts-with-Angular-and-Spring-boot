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

  operation: string = 'add';

  selectedProduit!: Product;

  constructor(private productService: ProductService, private fb: FormBuilder) {
    this.produitForm = this.fb.group({
      ref: ['', Validators.required],
      quantite: [''],
      prixUnit: [''],
    });
  }

  ngOnInit(): void {
    this.loadProducts();
  }

  loadProducts() {
    this.productService.getProduits().subscribe(
      (data) => {
        this.products = data;
      },
      (error) => {
        console.log('An error  was occured');
      },
      () => {
        console.log('loading of products wa done');
      }
    );
  }

  addProduct() {
    const p = this.produitForm.value;
    this.productService.addProduct(p).subscribe((res) => {
      this.loadProducts();
    });
  }

  updateProduct() {
    this.productService.updateProduct({}).subscribe((res) => {
      this.loadProducts();
    });
  }

  initProduit() {
    this.selectedProduit = new Product();
  }
}
