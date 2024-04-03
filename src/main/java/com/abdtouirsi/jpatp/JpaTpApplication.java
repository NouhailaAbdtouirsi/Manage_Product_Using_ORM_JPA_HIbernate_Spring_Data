package com.abdtouirsi.jpatp;

import com.abdtouirsi.jpatp.entities.Product;
import com.abdtouirsi.jpatp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaTpApplication  implements CommandLineRunner{
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaTpApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Dell XPS 13", 13000, 10));
        productRepository.save(new Product(null, "HP Pavilion", 8000, 15));
        productRepository.save(new Product(null, "MacBook Pro", 20000, 5));
        List<Product> products = productRepository.findAll();
        System.out.println("Get all products");
        products.forEach(p->{
            System.out.println(p.toString());
        });
        System.out.println("\n\n\n");
        System.out.println("*******************************************");

        Product product = productRepository.findById(Long.valueOf(1)).get();

        System.out.println("Get product by id 1");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("\n\n\n");
        System.out.println("*******************************************");
        System.out.println("Set product price to 15000");
        product.setPrice(15000);
        productRepository.save(product);
        product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println("\n\n\n");
        System.out.println("*******************************************");
        System.out.println("remove product by id 2");
        productRepository.deleteById(Long.valueOf(2));
        products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
    }
}
