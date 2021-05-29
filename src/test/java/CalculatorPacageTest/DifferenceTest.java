package CalculatorPacageTest;

import CalculatorPacage.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferenceTest extends CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testDifference() {
        System.out.println("Разность");
        Assert.assertEquals(8, calculator.difference(10, 2));
    }

    @Test
    public void testDifference1() {
        System.out.println("Разность 1");
        Assert.assertEquals(45, calculator.difference(100, 55));
    }

    @Test
    public void testDifference2() {
        System.out.println("Разность 2");
        Assert.assertEquals(2, calculator.difference(7, 5));
    }
}