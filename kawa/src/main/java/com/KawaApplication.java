package com;

import com.model.Product;
import com.repository.CustomerRepository;
import com.repository.OrderRepository;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KawaApplication implements CommandLineRunner {

	@Autowired
    ProductRepository productRepository;

	@Autowired
    CustomerRepository customerRepository;

	@Autowired
    OrderRepository orderRepository;



    public static void main(String[] args) {
		SpringApplication.run(KawaApplication.class, args);
	}


    @Override
    public void run(String... strings) throws Exception {

        Product americano = new Product();
        americano.setProductName("Americano");
        americano.setProductPrice(3.95);

        Product capuccinno = new Product();
        capuccinno.setProductName("Capuccinno");
        capuccinno.setProductPrice(4.95);

        Product latte = new Product();
        latte.setProductName("Latte");
        latte.setProductPrice(5.00);

        Product espresso = new Product();
        espresso.setProductName("Espresso");
        espresso.setProductPrice(3.5);

        Product herbata = new Product();
        herbata.setProductName("Herbata");
        herbata.setProductPrice(2.00);

        productRepository.save(americano);
        productRepository.save(capuccinno);
        productRepository.save(latte);
        productRepository.save(espresso);
        productRepository.save(herbata);


    }


}
