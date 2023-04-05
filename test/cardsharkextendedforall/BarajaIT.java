/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardsharkextendedforall;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kadir
 */
public class BarajaIT {
    
    public BarajaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.print("\n\nInicio del test de la clase Baraja\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.print("Fin del test de la clase Baraja\n\n");
    }
    
    /**
     * Test of getSize method, of class Baraja.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Baraja instance = new Baraja();
        int expResult = 52;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of barajar method, of class Baraja.
     */
    @Test
    public void testBarajar() {
        System.out.println("barajar");
        Baraja instance = new Baraja();
        Baraja expResult = new Baraja();
        instance.barajar();
        assertNotEquals(expResult, instance);
    }

    /**
     * Test of repartir method, of class Baraja.
     */
    @Test
    public void testRepartir() {
        System.out.println("repartir");
        int n = 5;
        Baraja instance = new Baraja();
        ArrayList<Carta> result = instance.repartir(n);
        
        assertEquals(result.size(), n);
    }

    /**
     * Test of toString method, of class Baraja.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Baraja instance = new Baraja();
        String expResult = "A CORAZONES\n" + "2 CORAZONES\n" + "3 CORAZONES\n" + "4 CORAZONES\n" + "5 CORAZONES\n" + "6 CORAZONES\n" + "7 CORAZONES\n" +
        "8 CORAZONES\n" + "9 CORAZONES\n" + "10 CORAZONES\n" +  "J CORAZONES\n" + "Q CORAZONES\n" +  "K CORAZONES\n" + "A PICAS\n" + "2 PICAS\n" +
        "3 PICAS\n" + "4 PICAS\n" + "5 PICAS\n" + "6 PICAS\n" + "7 PICAS\n" + "8 PICAS\n" + "9 PICAS\n" + "10 PICAS\n" + "J PICAS\n" + "Q PICAS\n" +
        "K PICAS\n" + "A DIAMANTES\n" +  "2 DIAMANTES\n" + "3 DIAMANTES\n" + "4 DIAMANTES\n" +"5 DIAMANTES\n" + "6 DIAMANTES\n" + "7 DIAMANTES\n" +
        "8 DIAMANTES\n" +  "9 DIAMANTES\n" + "10 DIAMANTES\n" +  "J DIAMANTES\n" + "Q DIAMANTES\n" +  "K DIAMANTES\n" +  "A TREBOLES\n" + "2 TREBOLES\n" +
        "3 TREBOLES\n" + "4 TREBOLES\n" + "5 TREBOLES\n" +  "6 TREBOLES\n" + "7 TREBOLES\n" + "8 TREBOLES\n" +  "9 TREBOLES\n" + "10 TREBOLES\n" +
        "J TREBOLES\n" + "Q TREBOLES\n" + "K TREBOLES\n";
        
        String result = instance.toString();
        
        assertEquals(expResult, result);
    }
    
}
