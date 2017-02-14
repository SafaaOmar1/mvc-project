/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author safaa
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of onOperationButtonClicked method, of class Controller.
     */
    @Test
    public void testOnOperationButtonClicked() {
        System.out.println("onOperationButtonClicked");
        String buttonTitle = "";
        Controller instance = null;
        instance.onOperationButtonClicked(buttonTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class Controller.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        String operation = "";
        double p1 = 0.0;
        double p2 = 0.0;
        Controller instance = null;
        boolean expResult = false;
        boolean result = instance.validate(operation, p1, p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class Controller.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        String operation = "";
        double p1 = 0.0;
        double p2 = 0.0;
        Controller instance = null;
        double expResult = 0.0;
        double result = instance.calculate(operation, p1, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
