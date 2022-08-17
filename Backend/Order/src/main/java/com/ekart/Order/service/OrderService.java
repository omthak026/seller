package com.ekart.Order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.Order.dto.OrderDTO;
import com.ekart.Order.entity.OrderEntity;
import com.ekart.Order.repository.OrderRepository;

@Service
public class OrderService{
	@Autowired
	private OrderRepository orderRepository;

	public OrderEntity saveOrder(OrderEntity order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	public Boolean delivery(Integer orderId,String orderStatus) {
		Optional<OrderEntity> orderEntity = orderRepository.findById(orderId);
		OrderEntity order = orderEntity.get();
		order.setOrderStatues(orderStatus);
		orderRepository.save(order);
		return true;
	}
	
	public List<OrderEntity> findOrderBySellerName(String sellerName){
		List<OrderEntity> orders = orderRepository.findBySellerName(sellerName);
		return orders;
	}
}
