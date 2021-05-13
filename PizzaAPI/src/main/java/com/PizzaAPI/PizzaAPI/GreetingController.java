package com.PizzaAPI.PizzaAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    //private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "price", defaultValue = "0.0") double price, @RequestParam(value = "vegetarian", defaultValue = "false") boolean veg) {
        return new Greeting(counter.incrementAndGet(), String.format(name), price, veg);
    }
}