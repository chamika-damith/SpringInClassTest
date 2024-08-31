package com.example.springinclasstest;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PreferenceManager {
    private List<FoodItem> preferences;

    @PostConstruct
    public void init() {
        preferences = new ArrayList<>();
    }

    public void addPreference(FoodItem item) {
        preferences.add(item);
    }

    public List<FoodItem> getPreferences() {
        return preferences;
    }
}

