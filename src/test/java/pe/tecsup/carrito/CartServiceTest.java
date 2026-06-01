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

}
