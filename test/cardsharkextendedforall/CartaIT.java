/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardsharkextendedforall;

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
public class CartaIT {
    
    public CartaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.print("\n\nInicio del test de la clase Carta");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.print("Fin del test de la clase Carta\n\n");
    }
   
    /**
     * Test of getValor method, of class Carta.
     */
    @Test
    public void testGetValor() throws FueraDeRangoException {
        System.out.println("getValor");
        Figura f[] = Figura.values();
       
        Carta instance = new Carta(2,f[0]);
        
        int expResult = 2;
        
        int result = instance.getValor();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getFigura method, of class Carta.
     */
    @Test
    public void testGetFigura() throws FueraDeRangoException {
        System.out.println("getFigura");
        
        Figura f[] = Figura.values();
       
        Carta instance = new Carta("K",f[0]);
        
        Figura expResult = f[0];
        
        Figura result = instance.getFigura();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getColor method, of class Carta.
     */
    @Test
    public void testGetColor() throws FueraDeRangoException {
        System.out.println("getColor");
        
        Figura f[] = Figura.values();
        Color c[] = Color.values();
       
        Carta instance = new Carta(2,f[0]);
        
        Color expResult = c[0];
        
        Color result = instance.getColor();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Carta.
     */
    @Test
    public void testToString() throws FueraDeRangoException {
        System.out.println("toString");
        
        Figura f[] = Figura.values();
       
        Carta instance = new Carta(2,f[0]);
        
        String expResult = "2 CORAZONES";
        String result = instance.toString();
        
        assertEquals(expResult, result);
    }
    
}
