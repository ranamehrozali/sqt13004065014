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
public class linkTest {
    
    public linkTest() {
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
     * Test of isEmpty method, of class link.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        link instance = new link();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class link.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int data = 0;
        link instance = new link();
        instance.insert(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class link.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int val = 0;
        link instance = new link();
        boolean expResult = false;
        boolean result = instance.search(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class link.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int k = 0;
        link instance = new link();
        instance.delete(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countNodes method, of class link.
     */
    @Test
    public void testCountNodes() {
        System.out.println("countNodes");
        link instance = new link();
        int expResult = 0;
        int result = instance.countNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorder method, of class link.
     */
    @Test
    public void testInorder() {
        System.out.println("inorder");
        link instance = new link();
        instance.inorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorder method, of class link.
     */
    @Test
    public void testPreorder() {
        System.out.println("preorder");
        link instance = new link();
        instance.preorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postorder method, of class link.
     */
    @Test
    public void testPostorder() {
        System.out.println("postorder");
        link instance = new link();
        instance.postorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
