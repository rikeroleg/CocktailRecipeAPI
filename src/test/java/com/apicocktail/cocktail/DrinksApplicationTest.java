//package com.apicocktail.cocktail;
//
//import com.apicocktail.cocktail.controller.DrinksController;
//import com.apicocktail.cocktail.model.Drinks;
//import com.apicocktail.cocktail.service.ServiceDrinks;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//
//import java.util.ArrayList;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = DrinksController.class, secure = false)
//public class DrinksApplicationTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ServiceDrinks drinksService;
//    private ArrayList<Drinks> drinksList;
//    private Drinks drinks;
//    private String jsonDrinks;
//
//    @Before
//    public void setup( ){
//        drinksList = new ArrayList<>();
//        drinks = new Drinks("Boulevardier","Cocktail", "Alcoholic", "Martini Glass",
//                "Stir with ice", "Amaretto", "", "", "", "",
//                "", "", "", "", "",
//                "", "", "", "", "", "");
//
//        drinksList.add(drinks);
//        jsonDrinks = "[{\"strDrink\":\"Boulevardier\"," +
//                "\"strCategory\":\"Cocktail\"," +
//                "\"strAlcoholic\":\"Alcoholic\"," +
//                "\"strGlass\":\"Martini Glass\"," +
//                "\"strInstructions\":\"Stir with ice\"," +
//                "\"strIngredient1\":\"Amaretto\"," +
//                "\"strIngredient2\":\"\"," +
//                "\"strIngredient3\":\"\"," +
//                "\"strIngredient4\":\"\"," +
//                "\"strIngredient5\":\"\"," +
//                "\"strIngredient6\":\"\"," +
//                "\"strIngredient7\":\"\"," +
//                "\"strIngredient8\":\"\"," +
//                "\"strMeasure1\":\"\"," +
//                "\"strMeasure2\":\"\"," +
//                "\"strMeasure3\":\"\"," +
//                "\"strMeasure4\":\"\"," +
//                "\"strMeasure5\":\"\"," +
//                "\"strMeasure6\":\"\"," +
//                "\"strMeasure7\":\"\"," +
//                "\"strMeasure8\":\"\"}]";
//    }
//
//    @Test
//    public void DrinksController() throws Exception {
//        Mockito.when(drinksService.getDrinkOfTheDay()).thenReturn(drinksList);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/all"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(jsonDrinks)).andReturn();
//    }
//
//
////    @Test
////    public void contextLoads() {
////    }
//
//}