import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { OfferPrice } from './offerPrice';

@Injectable({
  providedIn: 'root'
})
export class OfferPriceService {
  url:string="http://localhost:9001";
  sellerName:string="DTC";
  constructor(private httpClient:HttpClient) { }

  findProductBySeller():Observable<OfferPrice[]>{
    return this.httpClient.get<OfferPrice[]>(`${this.url}/products/${this.sellerName}`);
  }

  changeOfferPrice(offerPrice:number,cartItemId:number){
    return this.httpClient.put(`${this.url}/products/cartOffer/${cartItemId}/${offerPrice}`,{},{
      responseType:"text",
      headers : {
        "Access-Control-Allow-Origin" : "*"
      }
    });
  }
}
