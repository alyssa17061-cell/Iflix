import { Routes } from '@angular/router';
import { CategoriaList } from './categoria-list/categoria-list';
import { CategoriaForm } from './categoria-form/categoria-form';
export const routes: Routes = [
   {
    path : '',
    component: CategoriaList
   },
   {
      path: 'categoria',
      component: CategoriaForm
   },
   {
      path: 'categoria/:id',
      component: CategoriaForm
   }
];
