package com.ekart.Cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.Cart.dto.CartDTO;
import com.ekart.Cart.entity.CartEntity;
import com.ekart.Cart.service.CartService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@PostMapping("/")
	public CartEntity saveCart(@RequestBody CartEntity cart) {
		return cartService.saveCart(cart);
	}
	/*
	@GetMapping("/{cartItemId}")
	public String displayAll(Integer cartItemId) {
		return cartService.displayAll(cartItemId);
	}
	*/
	@GetMapping("/{seller}")
	public List<CartDTO> getProductsBySeller(@PathVariable("seller") String seller) {
		return cartService.getProductBySeller(seller);
	}
	
	
	@PutMapping("modify/{cartItemId}/{offerPrice}")
    public ResponseEntity<Boolean> offerPrice(@PathVariable Integer cartItemId, @PathVariable Integer offerPrice){
		
        Boolean bool = cartService.changeOfferPrice(cartItemId,offerPrice);
        return ResponseEntity.ok(bool);
    }
	
	
}
