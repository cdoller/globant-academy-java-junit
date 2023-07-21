/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 10;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of substract method, of class Calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 10;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 8;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 2;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 10;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 10;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        //assertEquals(expResult, new IllegalArgumentException());
    }
    
}
