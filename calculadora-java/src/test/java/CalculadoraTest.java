import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    public void testEsPrimo() {
        Calculadora calc = new Calculadora();
        assertEquals(true, calc.esPrimo(5));
        assertEquals(false, calc.esPrimo(4));
        assertEquals(true, calc.esPrimo(2));
        assertEquals(false, calc.esPrimo(1));
        assertEquals(false, calc.esPrimo(0));
    }

}