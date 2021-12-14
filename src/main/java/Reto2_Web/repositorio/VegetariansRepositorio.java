/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceVegetarians;
import Reto2_Web.modelo.Vegetarian;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class VegetariansRepositorio {
    @Autowired
    private InterfaceVegetarians repository;

    public List<Vegetarian> getAll() {
        return repository.findAll();
    }

    public Optional<Vegetarian> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Vegetarian create(Vegetarian clothe) {
        return repository.save(clothe);
    }

    public void update(Vegetarian clothe) {
        repository.save(clothe);
    }
    
    public void delete(Vegetarian clothe) {
        repository.delete(clothe);
    }
}
