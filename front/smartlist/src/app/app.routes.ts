import { Routes } from '@angular/router';
import { ShoppingListCreateComponent } from './shopping_list/components/shopping-list-create-component/shopping-list-create-component';
import { ShoppingListUpdateComponent } from './shopping_list/components/shopping-list-update-component/shopping-list-update-component';
import { ShoppingListDeleteComponent } from './shopping_list/components/shopping-list-delete-component/shopping-list-delete-component';
import { ShoppingListFindComponent } from './shopping_list/components/shopping-list-find-component/shopping-list-find-component';

import { ProductCreateComponent } from './product/components/product-create-component/product-create-component';
import { ProductUpdateComponent } from './product/components/product-update-component/product-update-component';
import { ProductDeleteComponent } from './product/components/product-delete-component/product-delete-component';
import { ProductFindComponent } from './product/components/product-find-component/product-find-component';

export const routes: Routes = [
  { path: '', redirectTo: 'lista/listar', pathMatch: 'full' },

  // Rotas de Lista de Compras
  { path: 'lista', redirectTo: 'lista/listar', pathMatch: 'full' },
  { path: 'lista/criar', component: ShoppingListCreateComponent },
  { path: 'lista/atualizar', component: ShoppingListUpdateComponent },
  { path: 'lista/deletar', component: ShoppingListDeleteComponent },
  { path: 'lista/listar', component: ShoppingListFindComponent },

  // Rotas de Produtos
  { path: 'produto', redirectTo: 'produto/listar', pathMatch: 'full' },
  { path: 'produto/criar', component: ProductCreateComponent },
  { path: 'produto/atualizar', component: ProductUpdateComponent },
  { path: 'produto/deletar', component: ProductDeleteComponent },
  { path: 'produto/listar', component: ProductFindComponent },

  { path: '**', redirectTo: 'lista/listar' }
];
