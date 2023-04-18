package repository;

import models.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkTypeRepository extends JpaRepository<DrinkType, Long> {
    

}
