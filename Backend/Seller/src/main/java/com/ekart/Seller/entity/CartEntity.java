package com.ekart.Seller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartEntity {
	@Id
	private Integer cartItemId;
	private String userId;
	private String productName;
	private String sellerName;
	private Integer price;
	private Integer quantity;
	private String category;
	private Integer cartOfferPrice;
}
