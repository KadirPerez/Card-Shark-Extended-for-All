/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package cardsharkextendedforall;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kadir
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({cardsharkextendedforall.CrupierIT.class, cardsharkextendedforall.CartaIT.class, cardsharkextendedforall.BarajaIT.class, cardsharkextendedforall.JugadorIT.class})
public class CardsharkextendedforallITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
