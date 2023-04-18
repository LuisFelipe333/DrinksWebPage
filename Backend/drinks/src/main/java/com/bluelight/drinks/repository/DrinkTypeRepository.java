package com.bluelight.drinks.repository;

import com.bluelight.drinks.models.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkTypeRepository extends JpaRepository<DrinkType, Long> {
    

}
