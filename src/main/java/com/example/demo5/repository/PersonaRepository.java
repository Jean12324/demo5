/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo5.repository;


import com.example.demo5.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Jeanc
 */
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    
}
