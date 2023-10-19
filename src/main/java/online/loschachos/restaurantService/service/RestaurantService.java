package online.loschachos.restaurantService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.loschachos.restaurantService.dto.RestaurantDTO;
import online.loschachos.restaurantService.entity.Restaurant;
import online.loschachos.restaurantService.mapper.RestaurantMapper;
import online.loschachos.restaurantService.repo.RestaurantRepo;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        return restaurants.stream().map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDTO)
                .collect(Collectors.toList());
    }

    public RestaurantDTO saveRestaurant(Restaurant restaurant) {
        return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurantRepo.save(restaurant));
    }

    public RestaurantDTO findRestaurantById(Long id) {
        return  RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurantRepo.findById(id).get());
    }

}
