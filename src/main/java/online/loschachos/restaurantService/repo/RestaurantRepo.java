package online.loschachos.restaurantService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import online.loschachos.restaurantService.entity.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {}
