package com.capgemini.managingCart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.capgemini.managingCart.beans.Cart;
import com.capgemini.managingCart.beans.CartProduct;
import com.capgemini.managingCart.beans.Customer;



public interface ICartRepo extends JpaRepository<CartProduct, String>{

	@Query("SELECT m FROM cart_product m WHERE m.CART_ID =:cartId")
	public List<CartProduct> findCartDTOsByCustomer(@Param("cartId")String cartId);
	
	@Query("SELECT m FROM cart_product m WHERE m.CART_ID =:cartId AND m.PROD_ID =:prodId")
	public CartProduct findByCustomerAndProduct(@Param("cartId")String cartId,@Param("prodId")String prodId);

}
