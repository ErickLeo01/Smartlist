import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ShoppingListDTO } from '../interface/ShoppingListDTO';
import { ShoppingListResponseDTO } from '../interface/ShoppingListResponseDTO';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root' // Torna o serviço disponível globalmente
})

export class ShoppingListService {

  private apiURL = 'http://localhost:8081/lista';

  constructor(private http: HttpClient) {}

  public createShoppingList(shoppingList: ShoppingListDTO): Observable<ShoppingListResponseDTO> {
    return this.http.post<ShoppingListResponseDTO>(`${this.apiURL}/criar`, shoppingList);
  }

  public updateShoppingList(id: string, shoppingList: ShoppingListDTO): Observable<ShoppingListResponseDTO> {
    return this.http.put<ShoppingListResponseDTO>(`${this.apiURL}/atualizar/${id}`, shoppingList);
  }

  public deleteShoppingList(id: string): Observable<string> {
    return this.http.delete<string>(`${this.apiURL}/deletar/${id}`);
  }

  public findShoppingListById(id: string): Observable<ShoppingListResponseDTO> {
    return this.http.get<ShoppingListResponseDTO>(`${this.apiURL}/listar/${id}`);
  }
}
