package com.apicocktail.cocktail.service;

import com.apicocktail.cocktail.model.Drinks;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class ServiceDrinks {


    private String text(JsonNode node, String field) {
        JsonNode n = node.get(field);
        return (n != null && !n.isNull()) ? n.textValue() : null;
    }

    public Drinks getDrinkOfTheDay() throws IOException {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> drink = restTemplate.getForEntity(
            "https://www.thecocktaildb.com/api/json/v1/1/random.php", String.class
        );
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(drink.getBody());
        JsonNode drinks = root.path("drinks");
        JsonNode beverage = drinks.get(0);

        return new Drinks(
                text(beverage, "strDrink"),
                text(beverage, "strCategory"),
                text(beverage, "strAlcoholic"),
                text(beverage, "strGlass"),
                text(beverage, "strInstructions"),
                text(beverage, "strDrinkThumb"),
                text(beverage, "strIngredient1"),
                text(beverage, "strIngredient2"),
                text(beverage, "strIngredient3"),
                text(beverage, "strIngredient4"),
                text(beverage, "strIngredient5"),
                text(beverage, "strIngredient6"),
                text(beverage, "strIngredient7"),
                text(beverage, "strIngredient8"),
                text(beverage, "strIngredient9"),
                text(beverage, "strIngredient10"),
                text(beverage, "strIngredient11"),
                text(beverage, "strIngredient12"),
                text(beverage, "strIngredient13"),
                text(beverage, "strIngredient14"),
                text(beverage, "strIngredient15"),
                text(beverage, "strMeasure1"),
                text(beverage, "strMeasure2"),
                text(beverage, "strMeasure3"),
                text(beverage, "strMeasure4"),
                text(beverage, "strMeasure5"),
                text(beverage, "strMeasure6"),
                text(beverage, "strMeasure7"),
                text(beverage, "strMeasure8"),
                text(beverage, "strMeasure9"),
                text(beverage, "strMeasure10"),
                text(beverage, "strMeasure11"),
                text(beverage, "strMeasure12"),
                text(beverage, "strMeasure13"),
                text(beverage, "strMeasure14"),
                text(beverage, "strMeasure15")
        );
    }

}
