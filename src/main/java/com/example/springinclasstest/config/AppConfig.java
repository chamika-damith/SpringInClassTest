package com.example.springinclasstest.config;

import com.example.springinclasstest.user.FoodItem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FoodItem chickenRoll() {
        return new FoodItem("chicken roll");
    }

    @Bean
    public FoodItem fishPastry() {
        return new FoodItem("fish pastry");
    }

    @Bean
    public FoodItem fishBun() {
        return new FoodItem("fish bun");
    }

    @Bean
    public FoodItem chickenBun() {
        return new FoodItem("chicken bun");
    }
}

