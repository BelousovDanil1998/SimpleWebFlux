package com.example.simplewebflux;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
public class NumberReceiver {
//Post request via Flux for example in Postman http://localhost:8080/receive send [1, 3, 35, 3, 2]
    @PostMapping("/receive")
    public Mono<Void> receiveNumbers(@RequestBody List<Integer> numbers) {
        return Flux.fromIterable(numbers)
                .sort()
                .doOnNext(System.out::println)
                .then();
    }
}
