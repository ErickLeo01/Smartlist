import { Component } from '@angular/core';
import { ShoppingListService } from '../../service/shopping-list-service';
import { ShoppingListDTO } from '../../interface/ShoppingListDTO';
import { ShoppingListResponseDTO } from '../../interface/ShoppingListResponseDTO';
import { Observable } from 'rxjs';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-shopping-list-update-component',
  styleUrl: './shopping-list-update-component.css',
  templateUrl: './shopping-list-update-component.html',
})

export class ShoppingListUpdateComponent {

  id: string = '';

  shoppingList: ShoppingListDTO = {
    name: '',
    description: '',
    creationDate: ''
  };

  constructor(private shoppingListService: ShoppingListService) {}

  public updateShoppingList(id: string): void {
    this.shoppingListService.updateShoppingList(id, this.shoppingList).subscribe({
      next: (response: ShoppingListResponseDTO) => {
        alert('Lista de compras atualizada com sucesso! ID: ' + response.id);

        this.id = '';

        this.shoppingList = {
          name: '',
          description: '',
          creationDate: ''
        };
      },

        error: (error) => {
          alert('Erro ao atualizar a lista de compras');
        }

        }
      )};
}
