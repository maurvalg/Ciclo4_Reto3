package Reto3_Back.interfaces;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import Reto3_Back.modelo.Order;

public interface InterfaceOrder extends CrudRepository<Order, Integer> {
	
	 @Query("{'salesMan.zone': ?0}")
	    List<Order> findByZone(final String country);
	    
	    @Query("{status: ?0}")
	    List<Order> findByStatus(final String status);

}
