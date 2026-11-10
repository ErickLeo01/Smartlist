import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ProductDTO } from '../interface/ProductDTO';
import { ProductResponseDTO } from '../interface/ProductResponseDTO';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root' // Torna o serviço disponível globalmente
})

export class ProductService {

  private apiURL = 'http://localhost:8081/produto';

  constructor(private http: HttpClient) {}

  public createProduct(product: ProductDTO): Observable<ProductResponseDTO> {
    return this.http.post<ProductResponseDTO>(`${this.apiURL}/criar`, product);
  }

  public updateProduct(id: string, product: ProductDTO): Observable<ProductResponseDTO> {
    return this.http.put<ProductResponseDTO>(`${this.apiURL}/atualizar/${id}`, product);
  }

  public deleteProduct(id: string): Observable<string> {
    return this.http.delete<string>(`${this.apiURL}/deletar/${id}`);
  }

  public findProductById(id: string): Observable<ProductResponseDTO> {
    return this.http.get<ProductResponseDTO>(`${this.apiURL}/listar/${id}`);
  }
}
