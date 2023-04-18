package com.bluelight.drinks.models;

import jakarta.persistence.*;

@Entity
@Table(name = "drink_types")
public class DrinkType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "drink_type_name", length = 60, nullable = false, unique = true)
    private String drinkTypeName;
    @Column(name = "cont_alcohol", nullable = false)
    private Boolean contAlcohol;
    @Column(name = "has_brands", nullable = false)
    private Boolean hasBrands;

    public DrinkType(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrinkTypeName() {
        return drinkTypeName;
    }

    public void setDrinkTypeName(String drinkTypeName) {
        this.drinkTypeName = drinkTypeName;
    }

    public Boolean getContAlcohol() {
        return contAlcohol;
    }

    public void setContAlcohol(Boolean contAlcohol) {
        this.contAlcohol = contAlcohol;
    }

    public Boolean getHasBrands() {
        return hasBrands;
    }

    public void setHasBrands(Boolean hasBrands) {
        this.hasBrands = hasBrands;
    }
}
