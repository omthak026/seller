import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './order';

@Injectable({
  providedIn: 'root'
})
export class OrderStatusService {
  url:string = "http://localhost:9001";
  sellerName:string="DTC";
  constructor(private httpClient:HttpClient) { }

  findProductBySeller():Observable<Order[]>{
    return this.httpClient.get<Order[]>(`${this.url}/products/orders/${this.sellerName}`);
  }

  deliverOrder(orderId:number):Observable<any>{
    return this.httpClient.put(`${this.url}/products/orders/${orderId}/delivered`,{},{
      responseType:"text"
    });
  }
}
