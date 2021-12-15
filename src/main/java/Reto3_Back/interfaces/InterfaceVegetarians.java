/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_Back.interfaces;

import java.util.List;

import Reto3_Back.modelo.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceVegetarians extends MongoRepository<Vegetarian, String> {
    
      @Query("{description: ?0}")
	    List<Vegetarian> findByDescriptionLike(final String status);
	   // List<Vegetarian> findByDescriptionContaining(final String description);
	  
	  @Query("{price: ?0}")
	    List<Vegetarian> findByPriceLessThanEqual(final double status);
    
}
