package com.ekart.Seller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekart.Seller.entity.ProductEntity;
@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity,String>{

	ProductEntity findBySeller(String seller);

	
}
