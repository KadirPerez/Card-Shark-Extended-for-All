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
public class JugadorIT {
    
    public JugadorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.print("\n\nInicio del test de la clase Jugador\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin del test de la clase Jugador\n\n");
    }


    /**
     * Test of recibirCartas and getSize method, of class Jugador.
     */
    @Test
    public void testRecibirCartaAndGetSize() {
        System.out.println("recibirCartas y getSize");
        Baraja baraja = new Baraja();
        Jugador instance = new Jugador();
        instance.recibirCartas(baraja.repartir(5));
        assertEquals(instance.getSize(), 5);
    }

   
    /**
     * Test of getCarta method, of class Jugador.
     */
    @Test
    public void testGetCarta(){
        System.out.println("getCarta");
        Baraja baraja = new Baraja();
        Jugador instance = new Jugador();
        instance.recibirCartas(baraja.repartir(5));
        Carta carta = instance.getCarta(0);
        assertNotEquals(carta, null);
    }

    /**
     * Test of aumentarPuntaje method, of class Jugador.
     */
    @Test
    public void testAumentarAndGetPuntaje() {
        System.out.println("aumentarPuntaje y getPuntaje");
        Jugador instance = new Jugador();
        instance.aumentarPuntaje(5);
        assertEquals(instance.getPuntaje(), 5);
    }

    /**
     * Test of removerCarta method, of class Jugador.
     */
    @Test
    public void testRemoverCarta() {
        System.out.println("removerCarta");
        Baraja baraja = new Baraja();
        Jugador instance = new Jugador();
        instance.recibirCartas(baraja.repartir(5));
        instance.removerCarta(0);
        assertEquals(instance.getSize(), 4);
    }
    
}
