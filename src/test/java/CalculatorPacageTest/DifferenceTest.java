package CalculatorPacageTest;

import CalculatorPacage.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferenceTest extends CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testDifference() {
        System.out.println("Разность");
        Assert.assertEquals(calculator.difference(10, 2), 8);
    }

    @Test
    public void testDifference1() {
        System.out.println("Разность 1");
        Assert.assertEquals(calculator.difference(100, 55), 45);
    }

    @Test
    public void testDifference2() {
        System.out.println("Разность 2");
        Assert.assertEquals(calculator.difference(7, 5), 2);
    }
}