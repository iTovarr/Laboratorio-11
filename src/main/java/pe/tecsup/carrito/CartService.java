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
        if (product == null) throw new NullPointerException("No se puede agregar un producto nulo");
        if (products.size() >= 10) {
            throw new IllegalStateException("El carrito no puede tener más de 10 productos");
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        products.add(product);
    }

    private static final double DISCOUNT_RATE = 0.10;
    private static final double DISCOUNT_THRESHOLD = 100.0;

    public double getTotalWithDiscount() {
        double total = getTotal();
        if (total > DISCOUNT_THRESHOLD) {
            return total * (1 - DISCOUNT_RATE);
        }
        return total;
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getProductCount() {
        return products.size();
    }
}
