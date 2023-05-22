/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repository;

import com.example.demo.Model.Gama;
import com.example.demo.Repository.CRUD.GammaCrudRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author santi
 */
@Repository
public class GammaRepository {
    @Autowired
    private GammaCrudRepository gammaCrudRepository;
    
    public List<Gama> findAll(){
        return (List<Gama>) gammaCrudRepository.findAll();
    }
    
    public Optional<Gama> getGamma(int id){
        return gammaCrudRepository.findById(id);
    }
   
    public Gama save(Gama gamma){
        return gammaCrudRepository.save(gamma);
    }
    
    public void delete(Gama gamma){
        gammaCrudRepository.delete(gamma);
    }
}
