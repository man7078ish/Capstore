package com.capgemini.capstore.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
