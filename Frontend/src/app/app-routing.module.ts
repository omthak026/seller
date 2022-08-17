import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OfferPriceComponent } from './seller/offer-price/offer-price.component';
import { OrderStatusComponent } from './seller/order-status/order-status.component';

const routes: Routes = [
  {path : "seller/userCart",component:OfferPriceComponent},
  {path : "seller/orderStatus",component:OrderStatusComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
