import { Component, OnInit } from '@angular/core';
import { Order } from './order';
import { OrderStatusService } from './order-status.service';

@Component({
  selector: 'app-order-status',
  templateUrl: './order-status.component.html',
  styleUrls: ['./order-status.component.css']
})
export class OrderStatusComponent implements OnInit {
  status!:string;
  orders!:Order[];
  successStatus!:boolean;
  constructor(private orderService:OrderStatusService) { }

  ngOnInit(): void {
    this.findProductsBySeller();
  }

  findProductsBySeller(){
    this.orderService.findProductBySeller().subscribe({
      next : (data)=>{
        this.orders = data;
      }
    })
  }

  onChange(target:any){
    console.log(target);
    if(target.checked){
      this.status = target.value;
    }
    console.log(this.status);
  }

  deliverOrder(order:Order){
    this.orderService.deliverOrder(order.orderId).subscribe({
      next : (data)=>{
        console.log(data);
        this.successStatus = data;
        this.findProductsBySeller();
      }
    })
  }

}
