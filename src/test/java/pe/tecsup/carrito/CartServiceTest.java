package pe.tecsup.carrito;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CartService - reglas de negocio del carrito")
class CartServiceTest {
    private CartService cart;

    @BeforeEach
    void setUp() {
        cart = new CartService();
    }

    @Test
    @DisplayName("Carrito vacío: total debe ser 0.0")
    void getTotal_carritoVacio_retornaCero() {
        // Arrange — hecho en setUp()

        // Act
        double total = cart.getTotal();

        // Assert
        assertEquals(0.0, total);
    }
    @Test
    @DisplayName("Agregar producto: total refleja el precio del producto")
    void addProduct_unProducto_totalIgualAlPrecio() {
        // Arrange
        Product laptop = new Product("Laptop", 850.0);

        // Act
        cart.addProduct(laptop);

        // Assert
        assertEquals(850.0, cart.getTotal());
    }
    @Test
    @DisplayName("Agregar mismo producto dos veces: total es precio × 2")
    void addProduct_mismoProductoDosVeces_totalEsDoble() {
        // Arrange
        Product mouse = new Product("Mouse", 25.0);

        // Act
        cart.addProduct(mouse);
        cart.addProduct(mouse);

        // Assert
        assertEquals(50.0, cart.getTotal());
    }
    @Test
    @DisplayName("Precio negativo: debe lanzar IllegalArgumentException")
    void addProduct_precioNegativo_lanzaExcepcion() {
        // Arrange
        Product invalido = new Product("Item inválido", -10.0);

        // Act + Assert
        assertThrows(IllegalArgumentException.class,
                () -> cart.addProduct(invalido));
    }
}
