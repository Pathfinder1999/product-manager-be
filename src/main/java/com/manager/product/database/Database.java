package com.manager.product.database;

import com.manager.product.models.Product;
import com.manager.product.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product product1 = new Product("Laptop","Apple",5,3500.0);
                Product product2 = new Product("Laptop","Dell",20,1500.0);
                Product product3 = new Product("Laptop","HP",15,2000.0);
                Product product4 = new Product("Laptop","Apple",2,7500.0);
                Product product5 = new Product("Smartphone","Apple",5,1000.0);
                Product product6 = new Product("Smartphone","Apple",5,899.0);
                Product product7 = new Product("Smartphone","Samsung",3,7800.0);
                Product product8 = new Product("SmartTV","Samsung",2,15500.0);
                Product product9 = new Product("SmartWatch","Apple",5,700.0);
                Product product10 = new Product("SmartWatch","Samsung",5,450.0);

                productRepository.save(product1);
                productRepository.save(product2);
                productRepository.save(product3);
                productRepository.save(product4);
                productRepository.save(product5);
                productRepository.save(product6);
                productRepository.save(product7);
                productRepository.save(product8);
                productRepository.save(product9);
                productRepository.save(product10);
            }
        };
    }
}
