package online.loschachos.restaurantService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import online.loschachos.restaurantService.dto.RestaurantDTO;
import online.loschachos.restaurantService.entity.Restaurant;
import online.loschachos.restaurantService.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
@CrossOrigin
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/fetchAllRestaurants")
    public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants(){
        return new ResponseEntity<List<RestaurantDTO>>(restaurantService.findAllRestaurants(), HttpStatus.OK);
    }

    @GetMapping("/findRestaurantById")
    public ResponseEntity<RestaurantDTO> fetchRestaurantById(@RequestParam Long id){
        return new ResponseEntity<RestaurantDTO>(restaurantService.findRestaurantById(id), HttpStatus.OK);
    }

    @PostMapping("/saveRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody Restaurant restaurant){
        return new ResponseEntity<RestaurantDTO>(restaurantService.saveRestaurant(restaurant), HttpStatus.OK);
    }
}
