package CalculatorPacageTest;

import CalculatorPacage.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test(description = "Выполнить тест в первую очередь",priority = 1)
    public void testSum() {
        System.out.println("Сумма 1");
        Assert.assertEquals(calculator.sum(2, 3), 5);
        Assert.assertEquals(calculator.sum(5, 5), 10);
    }

    @Test(priority = 3)
    public void testSum2() {
        System.out.println("Сумма 2");
        Assert.assertEquals(calculator.sum(11, 6), 17);
    }

    @Test(priority = 4)
    public void testSum3() {
        System.out.println("Сумма 3");
        Assert.assertEquals(calculator.sum(27, 8), 35);
    }

    @DataProvider(name = "Входящие данные для суммирования")
    public Object[][] inputForITechTask() {
        return new Object[][]{
                {7, calculator.sum(4, 3)},
                {11, calculator.sum(6, 5)},
                {152, calculator.sum(108,44)},
        };
    }

    @Test(dataProvider = "Входящие данные для суммирования", description = "Выполнить тест вторым",priority = 2)
    public void Sum(int rezult, int sumDigit) {
        System.out.println("Сумма DataProvider" + "\n" + rezult + "\n" + sumDigit);
        Assert.assertEquals(rezult, sumDigit);
    }
}