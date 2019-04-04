package com.capgemini.capstore.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.Wishlist;
@Repository
public interface WishlistRepo extends JpaRepository<Wishlist, Integer>,CrudRepository<Wishlist, Integer>{

	@Query("SELECT p FROM Wishlist p WHERE p.customer =:customer AND p.product =:product")
	public Wishlist findByCustomerAndProduct(@Param("customer")Customer customer,@Param("product")Product product);
	
	@Query("SELECT p FROM Wishlist p WHERE p.customer =:customer AND p.product =:product")
	public Wishlist DeleteWhereCustomerAndProduct(@Param("customer")Customer customer,@Param("product")Product product);
	
	@Query("SELECT p FROM Wishlist p WHERE p.customer =:customer")
	public List<Wishlist> findWishlistsByCustomer(@Param("customer")Customer customer);
	
}
