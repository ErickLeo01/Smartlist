import { Component } from '@angular/core';
import { ProductService } from '../../service/product-service';
import { ProductDTO } from '../../interface/ProductDTO';
import { ProductResponseDTO } from '../../interface/ProductResponseDTO';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-product-create-component',
  styleUrl: './product-create-component.css',
  templateUrl: './product-create-component.html',
})

export class ProductCreateComponent {

  product: ProductDTO = {
    name: '',
    quantity: 0,
    price: 0,
    status: false
  };

  constructor(private productService: ProductService) {}

  public createProduct(): void {
    this.productService.createProduct(this.product).subscribe({
      next: (response: ProductResponseDTO) => {
        alert('Produto criado com sucesso! ID: ' + response.id);

        this.product = {
          name: '',
          quantity: 0,
          price: 0,
          status: false
        };
      },

      error: (error) => {
        alert('Erro ao criar produto.');
      }
    })
  }
}
