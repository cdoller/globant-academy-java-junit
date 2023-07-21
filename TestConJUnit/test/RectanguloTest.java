/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Rectangulo;
import Servicios.RectanguloService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectanguloTest {

    public RectanguloTest() {
    }

    RectanguloService rs;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        rs = new RectanguloService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaInicializarConColor() {
        assertNotNull(new Rectangulo(10.0, 10.0).getColor());
    }

    @Test
    public void deberiaCalcularArea() {
        assertEquals(100.0, rs.calcularArea(new Rectangulo(10.0, 10.0)), 0);
        assertEquals(20.0, rs.calcularArea(new Rectangulo(4.0, 5.0)), 0);
        assertEquals(1.0, rs.calcularArea(new Rectangulo(1.0, 1.0)), 0);
        assertEquals(0.0, rs.calcularArea(new Rectangulo(10.0, 0.0)), 0);
    }

    @Test
    public void deberiaCalcularPerimetro() {
        assertEquals(40.0, rs.calcularPerimetro(new Rectangulo(10.0, 10.0)), 0);
        assertEquals(100.0, rs.calcularPerimetro(new Rectangulo(20.0, 30.0)), 0);
        assertEquals(30.0, rs.calcularPerimetro(new Rectangulo(10.0, 5.0)), 0);
    }

    @Test
    public void deberiaActivarODesactivar() {
        Rectangulo r = new Rectangulo(5.0, 5.0);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }
}
