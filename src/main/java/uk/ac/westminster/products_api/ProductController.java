package uk.ac.westminster.products_api;

import com.gavin.productapi.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product")
    public Product getProduct() {

        return new Product(
                1L,
                "Macbook Pro",
                4999.99
        );
    }
}
