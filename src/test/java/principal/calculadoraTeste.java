package principal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSoma() {
        Calculadora calc = new Calculadora();
        calc.setValorA(10);
        calc.setValorB(5);
        assertEquals(15, calc.getSoma());
    }

    @Test
    void testDiferenca() {
        Calculadora calc = new Calculadora();
        calc.setValorA(10);
        calc.setValorB(5);
        assertEquals(5, calc.getDiferenca());
    }

    @Test
    void testProduto() {
        Calculadora calc = new Calculadora();
        calc.setValorA(10);
        calc.setValorB(5);
        assertEquals(50, calc.getProduto());
    }

    @Test
    void testQuociente() {
        Calculadora calc = new Calculadora();
        calc.setValorA(10);
        calc.setValorB(5);
        assertEquals(2, calc.getQuociente());
    }

    @Test
    void testQuocienteDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        calc.setValorA(10);
        calc.setValorB(0);
        assertTrue(Double.isNaN(calc.getQuociente()));
    }
}
