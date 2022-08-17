package com.ekart.Seller.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	private String cartItemId;
	private String userId;
	private String productName;
	private String sellerName;
	private Integer price;
	private Integer quantity;
	private String category;
	private Integer cartOfferPrice;

}
