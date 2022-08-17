package com.ekart.Seller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.ekart.Seller.dto.CartDTO;
import com.ekart.Seller.dto.OrderDTO;
import com.ekart.Seller.entity.ProductEntity;
import com.ekart.Seller.service.ProductEntityService;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductEntityController {
	@Autowired
	private ProductEntityService productEntityService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public ProductEntity saveProductEntity(@RequestBody ProductEntity productEntity) {
		return productEntityService.saveProductEntity(productEntity);
	}
	
	@GetMapping("/{seller}")
	public List<CartDTO> findProductEntityBySeller(@PathVariable String seller) {
		ProductEntity product=this.productEntityService.findProductEntityBySeller(seller);
		List<CartDTO> pro = this.restTemplate.getForObject("http://localhost:9002/users/"+seller, List.class);
		
		return pro;
	}
	
	@PutMapping("/cartOffer/{cartItemId}/{offerPrice}")
	public ResponseEntity<String> offerPrice(@PathVariable("cartItemId") Integer cartItemId, @PathVariable("offerPrice") Integer offerPrice){
        this.restTemplate.put("http://localhost:9002/users/modify/"+cartItemId+"/"+offerPrice, offerPrice);
        return ResponseEntity.ok("Offer is provided to the user");
    }
	
	@PutMapping("/orders/{orderId}/{orderStatus}")
	public ResponseEntity<Boolean> delivery(@PathVariable("orderId") Integer orderId,@PathVariable String orderStatus){
		
        this.restTemplate.put("http://localhost:9003/orders/delivery/"+orderId+"/"+orderStatus, "delivered");
        return ResponseEntity.ok(true);
    }
	
	@GetMapping("/orders/{sellerName}")
	public ResponseEntity<List<OrderDTO>> findOrderBySeller(@PathVariable String sellerName){
		
        List<OrderDTO> order = this.restTemplate.getForObject("http://localhost:9003/orders/delivery/"+sellerName,List.class);
        return ResponseEntity.ok(order);
    }
	
	
}
