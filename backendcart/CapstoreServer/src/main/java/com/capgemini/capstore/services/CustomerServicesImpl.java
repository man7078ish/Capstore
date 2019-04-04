package com.capgemini.capstore.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.CartDTO;
import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.exceptions.InvalidInputException;
import com.capgemini.capstore.exceptions.ProductUnavailableException;
import com.capgemini.capstore.repo.CartRepo;
import com.capgemini.capstore.repo.CustomerRepo;
import com.capgemini.capstore.repo.MerchantRepo;
import com.capgemini.capstore.repo.OrdersRepo;
import com.capgemini.capstore.repo.ProductRepo;
import com.capgemini.capstore.repo.WishlistRepo;


@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices {

	Customer customer;
	Product product;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private CartRepo cartRepo;

	@Autowired
	private WishlistRepo wishlistRepo;

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private OrdersRepo ordersRepo;
	
	@Autowired
	private MerchantRepo merchantRepo;

	/*
	 * @Override public double applyDiscount(int productId) { product =
	 * productRepo.getOne(productId);
	 * 
	 * String discount = product.getDiscountOffered()();
	 * 
	 * double price = product.getProductPrice(); double finalPrice = price; if
	 * (discountIsValid(discount)) { double percentDiscount =
	 * discount.getPercentDiscount(); finalPrice = price - ((price *
	 * percentDiscount) / 100); product.setProductPrice(finalPrice); } return
	 * finalPrice; }
	 * 
	 * public boolean discountIsValid(String discount) {
	 * 
	 * Date date2 = discount.getEndDateOfDiscount(); Date date1 =
	 * discount.getStartDateOfDiscount(); if (date1.before(new Date()) &&
	 * date2.after(new Date())) {
	 * 
	 * return true; } return false; }
	 * 
	 * @Override
	 * 
	 * public double applyCoupon(int cartId) { Cart cart = cartRepo.getOne(cartId);
	 * Coupon coupon = cart.getCoupon(); double cartAmount = cart.getTotalAmount();
	 * double finalPrice = cartAmount; if (couponIsValid(coupon)) { double
	 * couponDiscount = coupon.getCouponDiscountValue(); finalPrice = cartAmount -
	 * ((cartAmount * couponDiscount) / 100); cart.setTotalAmount(finalPrice); }
	 * return finalPrice; }
	 */

	/*
	 * public boolean couponIsValid(Coupon coupon) { Date date2 =
	 * coupon.getCouponEndDate(); Date date1 = coupon.getCouponStartDate(); if
	 * (date1.before(new Date()) && date2.after(new Date())) {
	 * 
	 * return true; } return false; }
	 */

	@Override
	public List<CartDTO> getAllProductsFromCart(int customerId) throws InvalidInputException {
		List<CartDTO> cartList;

		customer = customerRepo.getOne(customerId);
	cartList = cartRepo.findCartDTOsByCustomer(customer);
		return cartList;
	}

	@Override
	public boolean addProductToWishlist(int customerId, int productId) throws InvalidInputException {
		product = productRepo.getOne(productId);
		customer = customerRepo.getOne(customerId);
		Wishlist wishlist = wishlistRepo.findByCustomerAndProduct(customer, product);
		if (wishlist == null) {
			wishlist = new Wishlist();
			wishlist.setCustomer(customer);
			wishlist.setProduct(product);
			wishlistRepo.save(wishlist);

		} else {
			wishlistRepo.save(wishlist);

		}
		return true;
	}

	@Override
	public boolean removeProductFromWishlist(int customerId, int productId) throws InvalidInputException {
		product = productRepo.getOne(productId);
		customer = customerRepo.getOne(customerId);
		Wishlist wishlist = wishlistRepo.findByCustomerAndProduct(customer, product);
		if(wishlist!=null)
		wishlist=wishlistRepo.DeleteWhereCustomerAndProduct(customer, product);
		return true;
	}

	@Override
	public List<Wishlist> getAllWishlist(int customerId) throws InvalidInputException {
		List<Wishlist> wishlist = new ArrayList<Wishlist>();
		try {
			customer = customerRepo.getOne(customerId);
			wishlist = wishlistRepo.findWishlistsByCustomer(customer);
		} catch (Exception e) {
			e.getMessage();
		}
		return wishlist;
	}

	@Override
	public CartDTO addProductToNewCart(int customerId,int merchantId, int productId, int quantity)
			throws ProductUnavailableException {
		product = productRepo.getOne(productId);
		String error = "This quantity of the product is not available";
		if (product.getProductQuantity() > quantity) {
			CartDTO cart = new CartDTO();
			cart.setQuantity(quantity);
			cart.setProduct(product);
			cart.setProductPrice(product.getProductPrice());
			cart.setCustomer(customerRepo.getOne(customerId));
			cart.setMerchant(merchantRepo.getOne(merchantId));
			return cartRepo.save(cart);
		} else
			throw new ProductUnavailableException(error);
	}

	@Override
	public CartDTO updateCart(int customerId, int productId, int quantity) throws ProductUnavailableException {
		customer = customerRepo.getOne(customerId);
		product = productRepo.getOne(productId);
		CartDTO cart = cartRepo.findByCustomerAndProduct(customer,product);
		String error = "This quantity of the product is not Available";

		
		if (product.getProductQuantity() > quantity) {
			if(quantity!=0) {
				cart.setQuantity(quantity);
				return cartRepo.save(cart);
			} else {
				return removeProductFromCart(customerId, productId);
			}
		} else
			throw new ProductUnavailableException(error);
	}

	@Override
	public CartDTO removeProductFromCart(int customerId, int productId) {
		customer = customerRepo.getOne(customerId);
		product = productRepo.getOne(productId);
		CartDTO cart = cartRepo.findByCustomerAndProduct(customer, product);
		cartRepo.delete(cart.getId());
		if(cart==null)
			return null;
		else
			return cart;
		
	}

}
