package com.ekart.Cart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.Cart.dto.CartDTO;
import com.ekart.Cart.entity.CartEntity;
import com.ekart.Cart.repository.CartRepository;


@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;

	public CartEntity saveCart(CartEntity cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	public String displayAll(Integer cartItemId) {
		// TODO Auto-generated method stub
		Optional<CartEntity> opt = cartRepository.findById(cartItemId) ;
		if(opt.isEmpty()) throw new EntityNotFoundException("Not Found");
		
		CartEntity cart = opt.get();
	    
		return cart.getProductName()+cart.getSellerName();
	}

	public List<CartDTO> getProductBySeller(String seller) {
		List<CartEntity> opt = cartRepository.findBySeller(seller);
		List<CartDTO> cartDTO = new ArrayList<>();
		opt.forEach(c->cartDTO.add(CartEntity.prepareCartDTO(c)));
		/*CartDTO cartDTO = new CartDTO();
	
		cartDTO.setCartItemId(cart.getCartItemId());
		cartDTO.setUserId(cart.getUserId());
		cartDTO.setProductName(cart.getProductName());*/
		return cartDTO;
	}

	public Boolean changeOfferPrice(Integer cartItemId, Integer offerPrice) {
		// TODO Auto-generated method stub
		Optional<CartEntity> cartEntity= cartRepository.findById(cartItemId);
		CartEntity cart = cartEntity.get();
		cart.setCartOfferPrice(offerPrice);
		cartRepository.save(cart);
 		return true;
	}
}
