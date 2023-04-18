package models;

import jakarta.persistence.*;

@Entity
@Table(name = "drink_types")
public class DrinkType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "drink_type_name", length = 60, nullable = false, unique = true)
    private String drinkTypeName;
    @Column(name = "cont_alcohol", nullable = false)
    private boolean contAlcohol;
    @Column(name = "has_brands", nullable = false)
    private boolean hasBrands;

    public DrinkType(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDrinkTypeName() {
        return drinkTypeName;
    }

    public void setDrinkTypeName(String drinkTypeName) {
        this.drinkTypeName = drinkTypeName;
    }

    public boolean isContAlcohol() {
        return contAlcohol;
    }

    public void setContAlcohol(boolean contAlcohol) {
        this.contAlcohol = contAlcohol;
    }

    public boolean isHasBrands() {
        return hasBrands;
    }

    public void setHasBrands(boolean hasBrands) {
        this.hasBrands = hasBrands;
    }
}
