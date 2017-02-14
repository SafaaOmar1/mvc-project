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
public class ModelTest {
    
    public ModelTest() {
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
     * Test of validate method, of class Model.
     */
    @Test
    public void testValidate_String() {
        System.out.println("validate");
        String exp = " ";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.validate(exp);
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Calc method, of class Model.
     */
    @Test
    public void testCalc_double_double() {
        System.out.println("Calc");
        double f = 1.0;
        double s = 1.0;
        Model instance = new Model();
        double expResult = 2.0;
        double result = instance.Calc(f, s);
        assertEquals(expResult, result, 2.0);
        
        expResult = 6.0;
        result = instance.Calc(1,5);//, s)
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Calc method, of class Model.
     */
    @Test
    public void testCalc_3args() {
        System.out.println("Calc");
        double p1 = 7.0;
        double p2 = 4.0;
        String op = "-";
        Model instance = new Model();
        double expResult = 3.0;
        double result = instance.Calc(p1, p2, op);
        assertEquals(expResult, result, 0.0);
        
         expResult = 12.0;
        result = instance.Calc(4,3,"*");//, s)
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of validate method, of class Model.
     */
    @Test
    public void testValidate_3args() {
        System.out.println("validate");
        String op = "/";
        double p1 = 2.0;
        double p2 = 0.0;
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.validate(op, p1, p2);
        assertEquals(expResult, result);
        
    
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
