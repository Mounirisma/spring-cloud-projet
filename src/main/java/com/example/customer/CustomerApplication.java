package com.example.customer;

import com.example.customer.Repositories.CustomerRepository;
import com.example.customer.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"ismail","ismail@gmail.com"));
            customerRepository.save(new Customer(null,"omar","omar@gmail.com"));
            customerRepository.save(new Customer(null,"simo","simo@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c);
            });
        };
    }
}
