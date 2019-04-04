package com.capgemini.capstore.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Order;
@Repository
public interface OrdersRepo extends JpaRepository<Order, Integer>{

}
