/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class bstnodeTest {
    
    public bstnodeTest() {
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
     * Test of setright method, of class bstnode.
     */
    @Test
    public void testSetright() {
        System.out.println("setright");
        bstnode k = null;
        bstnode instance = new bstnode();
        instance.setright(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setleft method, of class bstnode.
     */
    @Test
    public void testSetleft() {
        System.out.println("setleft");
        bstnode k = null;
        bstnode instance = new bstnode();
        instance.setleft(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getright method, of class bstnode.
     */
    @Test
    public void testGetright() {
        System.out.println("getright");
        bstnode instance = new bstnode();
        bstnode expResult = null;
        bstnode result = instance.getright();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getleft method, of class bstnode.
     */
    @Test
    public void testGetleft() {
        System.out.println("getleft");
        bstnode instance = new bstnode();
        bstnode expResult = null;
        bstnode result = instance.getleft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class bstnode.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        int d = 0;
        bstnode instance = new bstnode();
        instance.setData(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class bstnode.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        bstnode instance = new bstnode();
        int expResult = 0;
        int result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
