package com.repository;

import com.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
