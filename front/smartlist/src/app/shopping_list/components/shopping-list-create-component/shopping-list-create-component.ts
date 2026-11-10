import { Component } from '@angular/core';
import { ShoppingListService } from '../../service/shopping-list-service';
import { ShoppingListDTO } from '../../interface/ShoppingListDTO';
import { ShoppingListResponseDTO } from '../../interface/ShoppingListResponseDTO';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-shopping-list-create-component',
  styleUrl: './shopping-list-create-component.css',
  templateUrl: './shopping-list-create-component.html',
})
export class ShoppingListCreateComponent {

  shoppingList: ShoppingListDTO = {
      name: '',
      description: '',
      creationDate: ''
    };

    constructor(private shoppingListService: ShoppingListService) {}

    public createShoppingList(): void {
      this.shoppingListService.createShoppingList(this.shoppingList).subscribe({
        next: (response: ShoppingListResponseDTO) => {
          alert('Lista de compras criada com sucesso! ID: ' + response.id);

          this.shoppingList = {
            name: '',
            description: '',
            creationDate: ''
          };
        },

        error: (error) => {
          alert('Erro ao criar a lista de compras');
        }

      });
    }
}
