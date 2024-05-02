/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void pruebaSuma() {
        String resultado = Calculadora.calculadora("5", "3", "+");
        assertEquals("8.0", resultado);
    }
    
    @Test
    public void pruebaResta() {
        String resultado = Calculadora.calculadora("5", "3", "-");
        assertEquals("2.0", resultado);
    }
    
    @Test
    public void pruebaMultiplicacion() {
        String resultado = Calculadora.calculadora("5", "3", "*");
        assertEquals("15.0", resultado);
    }
    
    @Test
    public void pruebaDivision() {
        String resultado = Calculadora.calculadora("6", "3", "/");
        assertEquals("2.0", resultado);
    }
}   

