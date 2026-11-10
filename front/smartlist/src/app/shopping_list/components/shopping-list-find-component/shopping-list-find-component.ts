import { Component } from '@angular/core';
import { ShoppingListService } from '../../service/shopping-list-service';
import { ShoppingListResponseDTO } from '../../interface/ShoppingListResponseDTO';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-shopping-list-find-component',
  styleUrl: './shopping-list-find-component.css',
  templateUrl: './shopping-list-find-component.html',
})

export class ShoppingListFindComponent {

  id: string = '';

  shoppingList?: ShoppingListResponseDTO;

  constructor(private shoppingListService: ShoppingListService) {}

  public findShoppingListById(id: string): void {
  this.shoppingListService.findShoppingListById(id).subscribe({
    next: (response: ShoppingListResponseDTO) => {
      alert('Lista de compras encontrada com sucesso! ID: ' + response.id);
      this.shoppingList = response;
      this.id = '';
    },
    error: (error) => {
      alert('Erro ao buscar a lista de compras');

      this.shoppingList = undefined;
    }
  });
}
}
