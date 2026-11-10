import { Component } from '@angular/core';
import { ProductService } from '../../service/product-service';
import { ProductDTO } from '../../interface/ProductDTO';
import { ProductResponseDTO } from '../../interface/ProductResponseDTO';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-product-update-component',
  styleUrl: './product-update-component.css',
  templateUrl: './product-update-component.html',
})

export class ProductUpdateComponent {

  id: string = '';

  product: ProductDTO = {
    name: '',
    quantity: 0,
    price: 0,
    status: false
  };

  constructor(private productService: ProductService) {}

  public updateProduct(id: string): void {
    this.productService.updateProduct(id, this.product).subscribe({
      next: (response: ProductResponseDTO) => {
        alert('Informações do produto atualizadas com sucesso! ID: ' + response.id);

        this.id = '';

        this.product = {
          name: '',
          quantity: 0,
          price: 0,
          status: false
        };
      },

      error: (error) => {
        alert('Erro ao atualizar as informações do produto');
        }
      }
    )};
  }
