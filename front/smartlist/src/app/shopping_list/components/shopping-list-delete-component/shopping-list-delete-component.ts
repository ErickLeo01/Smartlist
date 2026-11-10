import { Component } from '@angular/core';
import { ShoppingListService } from '../../service/shopping-list-service';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-shopping-list-delete-component',
  styleUrl: './shopping-list-delete-component.css',
  templateUrl: './shopping-list-delete-component.html',
})

export class ShoppingListDeleteComponent {

  id: string = '';

  constructor(private shoppingListService: ShoppingListService) {}

  public deleteShoppingList(id: string): void {
    this.shoppingListService.deleteShoppingList(id).subscribe({
      next: (response: string) => {
        alert('Lista de compras deletada com sucesso!');

        this.id = '';
      },

      error: (error) => {
      alert('Erro ao deletar a lista de compras');
    }
    });

  }
}
