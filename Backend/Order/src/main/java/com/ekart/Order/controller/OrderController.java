package com.ekart.Order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.Order.dto.OrderDTO;
import com.ekart.Order.entity.OrderEntity;
import com.ekart.Order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/")
	public OrderEntity saveOrder(@RequestBody OrderEntity order) {
		return orderService.saveOrder(order);
		
	}
	
	@PutMapping("/delivery/{orderId}/{orderStatus}")
	public ResponseEntity<Boolean> delivery(@PathVariable Integer orderId,@PathVariable String orderStatus){
		System.out.println(orderId);
		return ResponseEntity.ok(orderService.delivery(orderId,orderStatus));
	}
	
	@GetMapping("/delivery/{sellerName}")
	public List<OrderEntity> findOrderBySellerName(@PathVariable String sellerName) {
		return orderService.findOrderBySellerName(sellerName);
	}
	
}
