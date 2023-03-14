import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../shared/product';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private apiServerUrl = environment.apiBaseUrl;
  private Products: Product[] = [];

  constructor(private http: HttpClient) {
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

  getProduits(): Observable<any> {
    return this.http.get(`${this.apiServerUrl}`);
  }

  addProduct(produit: Product): Observable<any> {
    return this.http.post(`${this.apiServerUrl}`, produit);
  }

  updateProduct(produit: Product): Observable<any> {
    return this.http.put(`${this.apiServerUrl}`, produit);
  }

  deleteProduct(ref: String): Observable<any> {
    return this.http.delete(`${this.apiServerUrl}/${ref}`);
  }
}
