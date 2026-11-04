import { Routes } from '@angular/router';

import { ShoppingListComponent } from './shopping_list/shopping-list-component/shopping-list-component';
import { ProductComponent } from './product/product-component/product-component';

export const routes: Routes = [
  { path: 'shopping-list', component: ShoppingListComponent },
  { path: 'products', component: ProductComponent }
];
