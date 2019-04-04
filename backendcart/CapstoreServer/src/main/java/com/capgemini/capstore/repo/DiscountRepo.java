package com.capgemini.capstore.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Offer;


@Repository
public interface DiscountRepo extends JpaRepository<Offer, Integer>{

}
