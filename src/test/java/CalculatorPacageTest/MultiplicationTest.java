package CalculatorPacageTest;

import CalculatorPacage.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest extends CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testMultiplication() {
        System.out.println("Произведение");
        Assert.assertEquals(calculator.multiplication(5,5), 25);
    }

    @Test
    public void testMultiplication2() {
        System.out.println("Произведение 2");
        Assert.assertEquals(calculator.multiplication(7, 7), 49);
    }

    @Test
    public void testMultiplication3() {
        System.out.println("Произведение - 3");
        Assert.assertEquals(calculator.multiplication(8, 9), 72);
    }
}