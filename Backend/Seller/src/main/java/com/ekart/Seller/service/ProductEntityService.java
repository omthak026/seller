package com.ekart.Seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ekart.Seller.VO.ResponseTemplateVO;
import com.ekart.Seller.entity.CartEntity;
import com.ekart.Seller.entity.ProductEntity;
import com.ekart.Seller.repository.ProductEntityRepository;

@Service
public class ProductEntityService {
	@Autowired
	private ProductEntityRepository productEntityRepository;
	
	/*
	@Autowired
	private RestTemplate restTemplate;
	*/
	
	public ProductEntity saveProductEntity(ProductEntity productEntity) {
		return productEntityRepository.save(productEntity);
	}

	public ProductEntity findProductEntityBySeller(String seller) {
		// TODO Auto-generated method stub
		return productEntityRepository.findBySeller(seller);
	}

	
	/*
	public ProductEntity findProductEntityBySeller(String seller) {
		return productEntityRepository.findBySeller(seller);
	}
	

	  ResponseTemplateVO getProductWithSeller(String seller) {
		ResponseTemplateVOvo =new ResponseTemplateVO();
		ProductEntity pro = productEntityRepository.findBySeller(seller);
		
		
		CartEntity cart = restTemplate.getForObject("http://localhost:9002/products/" + pro.getSeller(),ProductEntity.class);
		vo.setProductEntity(pro);
		vo.setCart(cart);
		return vo;
		
	}*/
}


