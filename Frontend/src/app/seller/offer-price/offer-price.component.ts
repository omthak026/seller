import { Component, OnInit } from '@angular/core';
import { OfferPriceService } from './offer-price.service';
import { OfferPrice } from './offerPrice';

@Component({
  selector: 'app-offer-price',
  templateUrl: './offer-price.component.html',
  styleUrls: ['./offer-price.component.css']
})
export class OfferPriceComponent implements OnInit {
  products!:OfferPrice[];
  selectedProduct!:OfferPrice;
  offerPrice!:number;
  successMessage!:string;
  constructor(private offerPriceService:OfferPriceService) { }

  ngOnInit(): void {
    this.findProductBySeller();
  }

  findProductBySeller(){
    this.offerPriceService.findProductBySeller().subscribe({
      next : (data) => {
        console.log(data);
        this.products = data;
      }
    })
  }

  selectProduct(product:OfferPrice){
    this.selectedProduct = product;
  }

  changeOfferPrice(){
    this.offerPriceService.changeOfferPrice(this.offerPrice,this.selectedProduct.cartItemId).subscribe({
      next:(data)=>{
        this.successMessage = data;
      }
    })
  }

}
