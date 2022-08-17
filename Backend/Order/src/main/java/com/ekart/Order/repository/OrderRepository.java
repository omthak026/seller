package com.ekart.Order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ekart.Order.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer>{

	@Query("select order from OrderEntity order where order.sellerName=?1")
	Optional<OrderEntity> findBysellerName(String sellerName);
	
	List<OrderEntity> findBySellerName(String sellerName);

}
