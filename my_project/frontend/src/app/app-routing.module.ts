import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LaptopListComponent } from './components/laptop-list/laptop-list.component';
import { LaptopCategoryMenuComponent } from './components/laptop-category-menu/laptop-category-menu.component';
import { LaptopDetailsComponent } from './components/laptop-details/laptop-details.component';
import { CartDetailsComponent } from './components/cart-details/cart-details.component';
import { CheckoutComponent } from './components/checkout/checkout.component';



const routes: Routes = [
  {path:'checkout',component:CheckoutComponent},
  {path:'cart-details',component:CartDetailsComponent},
  { path: 'laptops/:id', component: LaptopDetailsComponent },
  { path: 'Laptop', component: LaptopListComponent },
  { path: 'search/:keyword', component: LaptopListComponent },
  { path: 'LaptopCategory', component: LaptopCategoryMenuComponent },
  { path: 'category/:categoryId', component: LaptopListComponent },
  { path: 'details', component: LaptopDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
