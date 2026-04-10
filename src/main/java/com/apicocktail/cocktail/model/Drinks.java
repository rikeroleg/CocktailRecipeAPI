package com.apicocktail.cocktail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Drinks {

    @JsonProperty("strDrink")
    private String strDrink;
    @JsonProperty("strCategory")
    private String strCategory;
    @JsonProperty("strAlcoholic")
    private String strAlcoholic;
    @JsonProperty("strGlass")
    private String strGlass;
    @JsonProperty("strInstructions")
    private String strInstructions;
    @JsonProperty("strDrinkThumb")
    private String strDrinkThumb;
    @JsonProperty("strIngredient1")
    private String strIngredient1;
    @JsonProperty("strIngredient2")
    private String strIngredient2;
    @JsonProperty("strIngredient3")
    private String strIngredient3;
    @JsonProperty("strIngredient4")
    private String strIngredient4;
    @JsonProperty("strIngredient5")
    private String strIngredient5;
    @JsonProperty("strIngredient6")
    private String strIngredient6;
    @JsonProperty("strIngredient7")
    private String strIngredient7;
    @JsonProperty("strIngredient8")
    private String strIngredient8;
    @JsonProperty("strMeasure1")
    private String strMeasure1;
    @JsonProperty("strMeasure2")
    private String strMeasure2;
    @JsonProperty("strMeasure3")
    private String strMeasure3;
    @JsonProperty("strMeasure4")
    private String strMeasure4;
    @JsonProperty("strMeasure5")
    private String strMeasure5;
    @JsonProperty("strMeasure6")
    private String strMeasure6;
    @JsonProperty("strMeasure7")
    private String strMeasure7;
    @JsonProperty("strMeasure8")
    private String strMeasure8;
    @JsonProperty("strIngredient9")
    private String strIngredient9;
    @JsonProperty("strIngredient10")
    private String strIngredient10;
    @JsonProperty("strIngredient11")
    private String strIngredient11;
    @JsonProperty("strIngredient12")
    private String strIngredient12;
    @JsonProperty("strIngredient13")
    private String strIngredient13;
    @JsonProperty("strIngredient14")
    private String strIngredient14;
    @JsonProperty("strIngredient15")
    private String strIngredient15;
    @JsonProperty("strMeasure9")
    private String strMeasure9;
    @JsonProperty("strMeasure10")
    private String strMeasure10;
    @JsonProperty("strMeasure11")
    private String strMeasure11;
    @JsonProperty("strMeasure12")
    private String strMeasure12;
    @JsonProperty("strMeasure13")
    private String strMeasure13;
    @JsonProperty("strMeasure14")
    private String strMeasure14;
    @JsonProperty("strMeasure15")
    private String strMeasure15;

    public Drinks(){}

    public Drinks(String strDrink, String strCategory, String strAlcoholic, String strGlass, String strInstructions, String strDrinkThumb,
                   String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, String strIngredient5,
                   String strIngredient6, String strIngredient7, String strIngredient8, String strIngredient9, String strIngredient10,
                   String strIngredient11, String strIngredient12, String strIngredient13, String strIngredient14, String strIngredient15,
                   String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5,
                   String strMeasure6, String strMeasure7, String strMeasure8, String strMeasure9, String strMeasure10,
                   String strMeasure11, String strMeasure12, String strMeasure13, String strMeasure14, String strMeasure15) {
        this.strDrink = strDrink;
        this.strCategory = strCategory;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
        this.strDrinkThumb = strDrinkThumb;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strIngredient5 = strIngredient5;
        this.strIngredient6 = strIngredient6;
        this.strIngredient7 = strIngredient7;
        this.strIngredient8 = strIngredient8;
        this.strIngredient9 = strIngredient9;
        this.strIngredient10 = strIngredient10;
        this.strIngredient11 = strIngredient11;
        this.strIngredient12 = strIngredient12;
        this.strIngredient13 = strIngredient13;
        this.strIngredient14 = strIngredient14;
        this.strIngredient15 = strIngredient15;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
        this.strMeasure5 = strMeasure5;
        this.strMeasure6 = strMeasure6;
        this.strMeasure7 = strMeasure7;
        this.strMeasure8 = strMeasure8;
        this.strMeasure9 = strMeasure9;
        this.strMeasure10 = strMeasure10;
        this.strMeasure11 = strMeasure11;
        this.strMeasure12 = strMeasure12;
        this.strMeasure13 = strMeasure13;
        this.strMeasure14 = strMeasure14;
        this.strMeasure15 = strMeasure15;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public String getStrMeasure6() {
        return strMeasure6;
    }

    public String getStrMeasure7() {
        return strMeasure7;
    }

    public String getStrMeasure8() {
        return strMeasure8;
    }

    public String getStrIngredient9() { return strIngredient9; }
    public String getStrIngredient10() { return strIngredient10; }
    public String getStrIngredient11() { return strIngredient11; }
    public String getStrIngredient12() { return strIngredient12; }
    public String getStrIngredient13() { return strIngredient13; }
    public String getStrIngredient14() { return strIngredient14; }
    public String getStrIngredient15() { return strIngredient15; }

    public String getStrMeasure9() { return strMeasure9; }
    public String getStrMeasure10() { return strMeasure10; }
    public String getStrMeasure11() { return strMeasure11; }
    public String getStrMeasure12() { return strMeasure12; }
    public String getStrMeasure13() { return strMeasure13; }
    public String getStrMeasure14() { return strMeasure14; }
    public String getStrMeasure15() { return strMeasure15; }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }
}
