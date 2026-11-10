import { Component } from '@angular/core';
import { ProductService } from '../../service/product-service';
import { ProductResponseDTO } from '../../interface/ProductResponseDTO';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-product-find-component',
  styleUrl: './product-find-component.css',
  templateUrl: './product-find-component.html',
})

export class ProductFindComponent {

  id: string = '';

  product?: ProductResponseDTO;

  constructor(private productService: ProductService) {}

  public findProductById(id: string): void {
    this.productService.findProductById(id).subscribe({
      next: (response: ProductResponseDTO) => {
        alert('Produto encontrado com sucesso!' );

        this.id = '';

        this.product = response;
      },

      error: (error) => {
        alert('Erro ao buscar o produto');
        this.product = undefined;
      }
    });
  }
}
