
/**
 * Clase Calculadora que proporciona operaciones matemáticas básicas.
 * Permite realizar suma, resta, multiplicación y división de números.
 * También incluye un método para verificar si un número es primo.
 */
public class Calculadora {

    /**
     * Constructor de la clase Calculadora.
     */
    public Calculadora() {
        // Constructor vacío, no se requiere inicialización adicional
    }

    /**
     * Realiza la suma de dos números.
     *
     * @param a el primer número
     * @param b el segundo número
     * @return la suma de a y b
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números.
     *
     * @param a el minuendo
     * @param b el sustraendo
     * @return la resta de a y b
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números.
     *
     * @param a el primer número
     * @param b el segundo número
     * @return el producto de a y b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números.
     *
     * @param a el numerador
     * @param b el denominador
     * @return el cociente de a y b
     * @throws IllegalArgumentException si b es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    /**
     * Verifica si un número es primo.
     *
     * @param numero el número a verificar
     * @return true si el número es primo, false en caso contrario
     */
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(2, 3)); // 5.0
        System.out.println("Resta: " + calc.restar(3, 2)); // 1.0
        System.out.println("Multiplicación: " + calc.multiplicar(2, 3)); // 6.0
        System.out.println("División: " + calc.dividir(6, 3)); // 2.0
        System.out.println("Es primo (5): " + calc.esPrimo(5)); // true
        System.out.println("Es primo (4): " + calc.esPrimo(4)); // false
        System.out.println("Es primo (2): " + calc.esPrimo(2)); // true
        System.out.println("Es primo (1): " + calc.esPrimo(1)); // false
        System.out.println("Es primo (0): " + calc.esPrimo(0)); // false
        System.out.println("Es primo (-3): " + calc.esPrimo(-3)); // false
        System.out.println("Es primo (29): " + calc.esPrimo(29)); // true
        System.out.println("Es primo (97): " + calc.esPrimo(97)); // true
        System.out.println("Es primo (100): " + calc.esPrimo(100)); // false
    }
}
