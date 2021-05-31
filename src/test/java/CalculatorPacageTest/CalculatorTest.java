package CalculatorPacageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CalculatorTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Hello Word! BeforeMethod");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Good bye! AfterMethod");
    }
}