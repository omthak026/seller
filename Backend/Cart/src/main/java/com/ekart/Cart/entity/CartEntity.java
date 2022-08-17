package com.ekart.Cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ekart.Cart.dto.CartDTO;


@Entity
@Table(name="cartEntity")
public class CartEntity {
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
	public CartEntity(Integer cartItemId, String userId, String productName, String sellerName, Integer price,
			Integer quantity, String category, Integer cartOfferPrice) {
		super();
		this.cartItemId = cartItemId;
		this.userId = userId;
		this.productName = productName;
		this.sellerName = sellerName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.cartOfferPrice = cartOfferPrice;
	}
	public CartEntity() {
		super();
	}
	
	public static CartDTO prepareCartDTO(CartEntity cart) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setCartItemId(cart.getCartItemId());
		cartDTO.setUserId(cart.getUserId());
		cartDTO.setProductName(cart.getProductName());
		cartDTO.setSellerName(cart.getSellerName());
		cartDTO.setPrice(cart.getPrice());
		cartDTO.setQuantity(cart.getQuantity());
		cartDTO.setCategory(cart.getCategory());
		cartDTO.setCartOfferPrice(cart.getCartOfferPrice());	
		return cartDTO;
		
	}
	
}
