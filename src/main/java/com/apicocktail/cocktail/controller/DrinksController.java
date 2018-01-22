package com.apicocktail.cocktail.controller;

import com.apicocktail.cocktail.model.Drinks;
import com.apicocktail.cocktail.service.ServiceDrinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DrinksController {
    @Autowired
    private ServiceDrinks serviceDrinks;

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Drinks> getDrinks(){
       Drinks drink = new Drinks();
        try{
            drink = serviceDrinks.getDrinkOfTheDay();
        }catch (IOException exception) {}
        return new ResponseEntity<>(drink, HttpStatus.OK);
    }
}
