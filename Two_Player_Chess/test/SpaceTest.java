/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elisha Wu
 */
public class SpaceTest {
    
    public SpaceTest() {
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
     * Test of setNewPiece method, of class Space.
     */
    @Test
    public void testSetNewPiece() {
        System.out.println("setNewPiece");
        King wKing = new King("wK", "white", 1);
        Piece piece = wKing;
        Space instance = new Space(piece, 1);
        boolean expResult = true;
        boolean result = instance.setNewPiece(piece);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetNewPieceReplace() {
        System.out.println("setNewPiece");
        King bKing = new King("bK", "black", 1);
        King wKing = new King("wK", "white", 1);
        Piece piece = wKing;
        Space instance = new Space(piece, 1);
        boolean expResult = true;
        boolean result = instance.setNewPiece(piece);
        result = false;
        piece = bKing;
        result = instance.setNewPiece(piece);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
