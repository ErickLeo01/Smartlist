import { Component } from '@angular/core';
import { ProductService } from '../../service/product-service';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-product-delete-component',
  styleUrl: './product-delete-component.css',
  templateUrl: './product-delete-component.html',
})

export class ProductDeleteComponent {

  id: string = '';

  constructor(private productService: ProductService) {}

  public deleteProduct(id: string): void {
    this.productService.deleteProduct(id).subscribe({
      next: (response: string) => {
        alert('Produto deletado com sucesso!');

        this.id = '';
      },

      error: (error) => {
        alert('Erro ao deletar o produto');
      }
    })
  }
}
