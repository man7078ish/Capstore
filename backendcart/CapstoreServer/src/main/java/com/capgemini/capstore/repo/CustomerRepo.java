package com.capgemini.capstore.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

//	@Query("SELECT m FROM customerdetail m WHERE m.email =:email")
//	@Query("SELECT m FROM customerdetail m")
//	public Customer findByCustomerEmail(@Param("email")String customerEmail);

}
