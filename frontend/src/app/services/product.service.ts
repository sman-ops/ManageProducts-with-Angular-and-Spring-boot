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

  constructor(private http: HttpClient) {}

  public getProducts(): Product[] {
    return this.Products;
  }

  getProduits(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.apiServerUrl}`);
  }

  addProduct(produit: Product): Observable<Product> {
    return this.http.post<Product>(`${this.apiServerUrl}/add`, produit);
  }

  updateProduct(produit: Product): Observable<any> {
    return this.http.put(`${this.apiServerUrl}`, produit);
  }

  deleteProduct(ref: String): Observable<any> {
    return this.http.delete(`${this.apiServerUrl}/${ref}`);
  }
}
