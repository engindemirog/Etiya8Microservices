package com.etiyacrm.customerservice.repositories;

import com.etiyacrm.customerservice.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Long> {
}
