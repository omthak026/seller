package com.ekart.Seller.VO;

import com.ekart.Seller.entity.CartEntity;
import com.ekart.Seller.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	private Cart cart;
	private ProductEntity productEntity;
	public void setCart(CartEntity cart2) {
		// TODO Auto-generated method stub
		
	}
	public void setProductEntity(ProductEntity pro) {
		// TODO Auto-generated method stub
	}
}
