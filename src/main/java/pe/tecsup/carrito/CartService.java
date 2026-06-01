package pe.tecsup.carrito;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private List<Product> products = new ArrayList<>();

    public double getTotal() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
