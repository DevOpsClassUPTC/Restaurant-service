package online.loschachos.restaurantService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import online.loschachos.restaurantService.dto.RestaurantDTO;
import online.loschachos.restaurantService.entity.Restaurant;

@Mapper
public interface RestaurantMapper { 
    public static final RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
    
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}
