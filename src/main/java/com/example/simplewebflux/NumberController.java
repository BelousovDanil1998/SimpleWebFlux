package com.example.simplewebflux;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class NumberController {
    //Get http://localhost:8080/numbers via Flux controller
    @GetMapping ("/numbers")
    public Flux<Integer> getNumbers() {
        return Flux.just(1, 2, 3, 4, 5, 35, 678, 1);
    }
}
