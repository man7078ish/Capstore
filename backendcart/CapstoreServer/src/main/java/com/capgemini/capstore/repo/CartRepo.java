package com.capgemini.capstore.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.CartDTO;
import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Product;


@Repository
public interface CartRepo extends JpaRepository<CartDTO, Integer>{

	@Query("SELECT m FROM CartDTO m WHERE m.customer =:customer")
	public List<CartDTO> findCartDTOsByCustomer(@Param("customer")Customer customer);

	@Query("SELECT m FROM CartDTO m WHERE m.customer =:customer AND m.product =:product")
	public CartDTO findByCustomerAndProduct(@Param("customer")Customer customer,@Param("product")Product product);
}
