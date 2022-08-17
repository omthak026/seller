package com.ekart.Cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ekart.Cart.entity.CartEntity;
@Repository
public interface CartRepository extends JpaRepository<CartEntity,Integer>{

	
	@Query("select seller from CartEntity seller where seller.sellerName=?1")
	public List<CartEntity> findBySeller(String seller);

	
}
