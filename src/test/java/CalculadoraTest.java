import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void before(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarCorretamente(){
        int a = 1;
        int b = 5;
        int resultado = calculadora.somar(a,b);
        Assertions.assertEquals(6,resultado);
    }

    @Test
    public void deveSubtrairCorretamente(){
        int a = 20;
        int b = 5;
        int resultado = calculadora.subtrair(a,b);
        Assertions.assertEquals(15,resultado);
    }

    @Test
    public void deveDividirCorretamente(){
        int a = 100;
        int b = 50;
        Assertions.assertTrue(calculadora.dividir(a,b) == 2);
    }

    @Test
    public void deveMultiplicarCorretamente(){
        int a = 2;
        int b = 2;
        Assertions.assertTrue(calculadora.multiplicar(a,b) == 4);
    }
}
