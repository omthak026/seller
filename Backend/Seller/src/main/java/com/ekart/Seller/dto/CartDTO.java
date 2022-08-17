package com.ekart.Seller.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class CartDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartItemId;
	private String userId;
	private String productName;
	private String sellerName;
	private Integer price;
	private Integer quantity;
	private String category;
	private Integer cartOfferPrice;
	public Integer getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(Integer cartItemId) {
		this.cartItemId = cartItemId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getCartOfferPrice() {
		return cartOfferPrice;
	}
	public void setCartOfferPrice(Integer cartOfferPrice) {
		this.cartOfferPrice = cartOfferPrice;
	}
	/*
	public static CartEntity prepareCartEntity(CartDTO cartDTO) {
		CartEntity cart = new CartEntity();
		cart.setCartItemId(cartDTO.getCartItemId());
		cart.setUserId(cartDTO.getUserId());
		cart.setProductName(cartDTO.getProductName());
		cart.setSellerName(cartDTO.getSellerName());
		cart.setPrice(cartDTO.getPrice());
		cart.setQuantity(cartDTO.getQuantity());
		cart.setCategory(cartDTO.getCategory());
		cart.setCartOfferPrice(cartDTO.getCartOfferPrice());	
		return cart;
		
	}
	
	*/
}
