import { Injectable } from '@angular/core';
import { Product } from '../shared/product';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private Products: Product[] = [];

  constructor() {
    let p1: Product = new Product('Livre', 10, 100);
    let p2: Product = new Product('Style', 20, 300);
    let p3: Product = new Product('cahier', 5, 130);
    this.Products.push(p1);
    this.Products.push(p2);
    this.Products.push(p3);
  }

  public getProducts(): Product[] {
    return this.Products;
  }
}
