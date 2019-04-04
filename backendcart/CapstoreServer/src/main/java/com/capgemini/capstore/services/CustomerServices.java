package com.capgemini.capstore.services;

import java.util.List;

import com.capgemini.capstore.beans.CartDTO;
import com.capgemini.capstore.beans.Category;
import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Order;
import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.exceptions.CustomerNotFoundException;
import com.capgemini.capstore.exceptions.InvalidInputException;
import com.capgemini.capstore.exceptions.ProductUnavailableException;

public interface CustomerServices {

	public boolean addProductToWishlist(int customerId,int productId) throws InvalidInputException;

	public boolean removeProductFromWishlist(int customerId,int productId) throws InvalidInputException;

	public List<Wishlist> getAllWishlist(int customerId) throws InvalidInputException;

	public List<CartDTO> getAllProductsFromCart(int customerId) throws InvalidInputException;

	CartDTO addProductToNewCart(int customerId,int merchantID,int productId, int quantity) throws ProductUnavailableException;

	CartDTO updateCart(int customerId,int productId, int quantity) throws ProductUnavailableException;

	CartDTO removeProductFromCart(int customerId,int productId);//once removed from cart, update stock & quantity in product

	/*
	 * double applyDiscount(int productId);
	 * 
	 * double applyCoupon(int cartId);
	 */
}
