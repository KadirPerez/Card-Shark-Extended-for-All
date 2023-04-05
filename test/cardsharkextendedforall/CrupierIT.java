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
public class CrupierIT {
    
    public CrupierIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.print("\n\nInicio del test de la clase Crupier\n");

    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.print("Fin del test de la clase Crupier\n\n");
    }
    
    /**
     * Test of generarBarajas method, of class Crupier.
     */
    @Test
    public void testGenerarAndGetBarajas() {
        System.out.println("generarBarajas y getBarajas");
        Crupier instance = new Crupier();
        instance.setCantidadBarajas(5);
        instance.generarBarajas();
        ArrayList<Baraja> barajas = instance.getBarajas();
        assertEquals(barajas.size(), 5);
    }

    /**
     * Test of setCantidadBarajas method, of class Crupier.
     */
    @Test
    public void testSetAndGetCantidadBarajas() {
        System.out.println("setCantidadBarajas y getCantidadBarajas");
        Crupier instance = new Crupier();
        instance.setCantidadBarajas(2);
        assertEquals(instance.getCantidadBarajas(), 2);
    }

    /**
     * Test of repartir method, of class Crupier.
     */
    @Test
    public void testRepartir() {
        System.out.println("repartir");
        Crupier instance = new Crupier();
        instance.generarBarajas();
        ArrayList<Carta> result = instance.repartir(5);
        assertEquals(result.size(), 5);
    }

    /**
     * Test of comprobarGanador method, of class Crupier.
     */
    @Test
    public void testComprobarGanador() {
        System.out.println("comprobarGanador");
        Jugador[] jugadores = new Jugador[2];
        jugadores[0] = new Jugador();
        jugadores[1] = new Jugador();
        jugadores[0].aumentarPuntaje(1);
        jugadores[1].aumentarPuntaje(2);
        Crupier instance = new Crupier();
        ArrayList<Integer> expResult = new ArrayList();
        expResult.add(1);
        ArrayList<Integer> result = instance.comprobarGanador(jugadores, 2);
        assertEquals(expResult, result);
    }
    
}
