package red.softn.npedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import red.softn.npedidos.entity.FoodDish;

@Repository
public interface FoodDishRepository extends JpaRepository<FoodDish, Integer> {}
