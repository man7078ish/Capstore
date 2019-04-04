package com.capgemini.capstoreServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.beans.CartDTO;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.exceptions.InvalidInputException;
import com.capgemini.capstore.services.CustomerServices;

@RestController
@RequestMapping("api/capStore")
public class ServerController {

	@Autowired
	private CustomerServices customerService; 

	
	@RequestMapping(value= "/getWishlist")
	public List<Wishlist> getWishlist(int customerId) {
		 List<Wishlist> wishList=null;
		try {
			wishList = customerService.getAllWishlist(customerId);
		} catch (InvalidInputException e) {
			return wishList;
		}
		
		return wishList;
	}

	@RequestMapping(value= "/addProductToWishlist")
	public boolean addProductToWishlist(int customerId, int productId) {
		boolean val;
		try {
			 val=customerService.addProductToWishlist(customerId, productId);
		} catch (InvalidInputException e) {
			return false;
		}
		
		return val;
	}

	@RequestMapping(value= "/removeProductFromWishlist")
	public boolean removeProductFromWishlist(int customerId,int productId) {
		boolean val;
		try {
			val=customerService.removeProductFromWishlist(customerId, productId);
		} catch (InvalidInputException e) {
			return false;
		}
		
		return val;
	}
/*	@RequestMapping(value= "/applyDiscount")
	public double applyDiscount(int productId){
		
		return customerService.applyDiscount(productId);
	}
*/
	
	@RequestMapping(value= "/addProductToNewCart")
	public CartDTO addProductToNewCart(int customerId,int merchantId,int quantity, int productId) { 
		CartDTO cart=null;
		try {
			cart= customerService.addProductToNewCart(customerId,merchantId, productId, quantity);
		}
		catch  (Exception e) {
			return cart;
		}
		return cart;
	}
	@RequestMapping(value= "/updateCart")
	public CartDTO updateCart(int customerId,int quantity, int productId) {
		CartDTO cart=null;
		try {
			cart = customerService.updateCart(customerId, productId, quantity);
		} catch (Exception e) {
			return cart;
		}
		
		return cart;
	}
	@RequestMapping(value= "/removeFromCart")
	public CartDTO removeFromCart(int customerId,int productId) {
		
		return customerService.removeProductFromCart(customerId, productId);
	}
	@RequestMapping(value= "/getCart")
	public List<CartDTO> getCart(int customerId) {
		List<CartDTO> cartList = null;
		try {
			cartList = customerService.getAllProductsFromCart(customerId);
		} catch (InvalidInputException e) {
			return cartList;
		}
		
		return cartList;
	}
}
