package com.chauyiu1994.testhateoas.testhateoas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader {

    @Bean
    CommandLineRunner init(OrderRepository repository) {

        return args -> {
            repository.save(new Order("grande mocha"));
            repository.save(new Order("venti hazelnut machiatto"));
        };
    }
}