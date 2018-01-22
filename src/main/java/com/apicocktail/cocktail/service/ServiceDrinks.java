package com.apicocktail.cocktail.service;

import com.apicocktail.cocktail.model.Drinks;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class ServiceDrinks {


    public Drinks getDrinkOfTheDay() throws IOException {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> drink = restTemplate.getForEntity(
            "http://www.thecocktaildb.com/api/json/v1/1/random.php", String.class
        );
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(drink.getBody());
        JsonNode drinks = root.path("drinks");
        JsonNode beverage = drinks.get(0);

        ArrayList<Drinks> drinksList = new ArrayList<>();
        drinksList.add(new Drinks(
                beverage.get("strDrink").textValue(),
                beverage.get("strCategory").textValue(),
                beverage.get("strAlcoholic").textValue(),
                beverage.get("strGlass").textValue(),
                beverage.get("strInstructions").textValue(),
                beverage.get("strDrinkThumb").textValue(),
                beverage.get("strIngredient1").textValue(),
                beverage.get("strIngredient2").textValue(),
                beverage.get("strIngredient3").textValue(),
                beverage.get("strIngredient4").textValue(),
                beverage.get("strIngredient5").textValue(),
                beverage.get("strIngredient6").textValue(),
                beverage.get("strIngredient7").textValue(),
                beverage.get("strIngredient8").textValue(),
                beverage.get("strMeasure1").textValue(),
                beverage.get("strMeasure2").textValue(),
                beverage.get("strMeasure3").textValue(),
                beverage.get("strMeasure4").textValue(),
                beverage.get("strMeasure5").textValue(),
                beverage.get("strMeasure6").textValue(),
                beverage.get("strMeasure7").textValue(),
                beverage.get("strMeasure8").textValue()
                ));
        return drinksList.get(0);
    }

}
