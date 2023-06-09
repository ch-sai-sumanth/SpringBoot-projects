package com.geekster.Restaurant_Management_Service.service;

import com.geekster.Restaurant_Management_Service.model.Food;
import com.geekster.Restaurant_Management_Service.model.OrderFood;
import com.geekster.Restaurant_Management_Service.model.Restaurant;
import com.geekster.Restaurant_Management_Service.model.User;
import com.geekster.Restaurant_Management_Service.repository.IFoodRepository;
import com.geekster.Restaurant_Management_Service.repository.IOrderRepository;
import com.geekster.Restaurant_Management_Service.repository.IRestaurantRepository;
import com.geekster.Restaurant_Management_Service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    @Autowired
    IRestaurantRepository restaurantRepository;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    IFoodRepository foodRepository;

    public String orderFood(OrderFood orderFood) {
        Restaurant restaurant = restaurantRepository.findById(orderFood.getRestaurant().getRestaurantId()).get();
        Food food = foodRepository.findById(orderFood.getFood().getFoodId()).get();
        User user = userRepository.findById(orderFood.getUser().getUserId()).get();

        orderFood.setRestaurant(restaurant);
        orderFood.setUser(user);
        orderFood.setFood(food);

        orderRepository.save(orderFood);
        return "Your order is placed";
    }

    public Optional<OrderFood> getOrderDetailsById(Integer id) {
        return orderRepository.findById(id);
    }
}
