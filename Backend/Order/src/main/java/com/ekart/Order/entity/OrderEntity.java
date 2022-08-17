package com.ekart.Order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OrderEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	private Integer userId;
	private Integer productNumber;
	private String sellerName;
	private String orderStatues;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getOrderStatues() {
		return orderStatues;
	}
	public void setOrderStatues(String orderStatues) {
		this.orderStatues = orderStatues;
	}
	
}
