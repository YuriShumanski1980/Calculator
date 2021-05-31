package CalculatorPacageTest;

import CalculatorPacage.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testDivision() {
        System.out.println("Частное");
        Assert.assertEquals(calculator.division(64, 8), 8);
    }

    @Test
    public void testDivision2() {
        System.out.println("Частное 2");
        Assert.assertEquals(calculator.division(45, 3), 15);
    }

    @Test
    public void testDivision3() {
        System.out.println("Частное 3");
        Assert.assertEquals(calculator.division(600, 4), 150);
    }
}