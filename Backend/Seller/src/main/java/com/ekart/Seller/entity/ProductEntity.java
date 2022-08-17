package com.ekart.Seller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String displayName;
	private String description;
	private String features;
	private String category;
	private Double price;
	private Double discount;
	private Double deliveryFee;
	private Double offerPrice;
	private String seller;
	private Double sellerRevenue;
	private Integer sellerCount;
	private Integer avgRating;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getDeliveryFee() {
		return deliveryFee;
	}
	public void setDeliveryFee(Double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	public Double getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public Double getSellerRevenue() {
		return sellerRevenue;
	}
	public void setSellerRevenue(Double sellerRevenue) {
		this.sellerRevenue = sellerRevenue;
	}
	public Integer getSellerCount() {
		return sellerCount;
	}
	public void setSellerCount(Integer sellerCount) {
		this.sellerCount = sellerCount;
	}
	public Integer getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(Integer avgRating) {
		this.avgRating = avgRating;
	}
	public ProductEntity(Integer id, String displayName, String description, String features, String category,
			Double price, Double discount, Double deliveryFee, Double offerPrice, String seller, Double sellerRevenue,
			Integer sellerCount, Integer avgRating) {
		super();
		Id = id;
		this.displayName = displayName;
		this.description = description;
		this.features = features;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.deliveryFee = deliveryFee;
		this.offerPrice = offerPrice;
		this.seller = seller;
		this.sellerRevenue = sellerRevenue;
		this.sellerCount = sellerCount;
		this.avgRating = avgRating;
	}
	
}
