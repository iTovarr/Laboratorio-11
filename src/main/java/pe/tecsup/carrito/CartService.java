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
        if (product == null) {
            throw new NullPointerException("No se puede agregar un producto nulo");
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException(
                    "El precio del producto no puede ser negativo: " + product.getPrice());
        }
        products.add(product);
    }
    public double getTotalWithDiscount() {
        double total = getTotal();
        if (total > 100.0) {
            return total * 0.90;
        }
        return total;
    }
}
