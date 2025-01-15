package com.turkcell.crm.repository;

import com.turkcell.crm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> // < Hangi ürün,primary key tipi>
{


}
