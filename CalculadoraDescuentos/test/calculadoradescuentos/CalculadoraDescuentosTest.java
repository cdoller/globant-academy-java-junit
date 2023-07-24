/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradescuentos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CalculadoraDescuentosTest {

    private CalculadoraDescuentos instance;
    public static final Double VALOR_DEFAULT = 100.0;

    public CalculadoraDescuentosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new CalculadoraDescuentos(VALOR_DEFAULT, 0.0);
    }

    @After
    public void tearDown() {
        instance.setDescuentoPorcentual(0.0);
    }

    /**
     * Test of constructor
     */
    @Test
    public void debeInicializarseSinDescuento() {
        assertEquals(VALOR_DEFAULT, instance.getImporteBruto(), 0);
        assertEquals(VALOR_DEFAULT, instance.getImporteConDescuento(), 0);
        assertEquals(0, instance.getDescuentoPorcentual(), 0);
    }

    /**
     * Test of setDescuentoPorcentual
     */
    @Test
    public void debeSetearDescuentoPorcentual() {
        instance.setDescuentoPorcentual(9.91);
        assertEquals(9.91, instance.getDescuentoPorcentual(), 0);
    }

    /**
     * Test of setImporteBruto
     */
    @Test
    public void debeSetearImporteBruto() {
        instance.setImporteBruto(VALOR_DEFAULT * 2);
        assertEquals(VALOR_DEFAULT * 2, instance.getImporteBruto(), 0);
    }

    /**
     * Test of getDescuentoPorcentual method, of class CalculadoraDescuentos.
     */
    @Test
    public void debeHacerDescuentoPorcentual() {
        System.out.println("Descuento valido");
        Double descuento = 33.3;
        instance.setDescuentoPorcentual(descuento);
        assertEquals(VALOR_DEFAULT * (1 - (descuento / 100)), instance.getImporteConDescuento(), 0.01);
        // Descuento negativo (aumento)
        descuento = -20.5;
        instance.setDescuentoPorcentual(descuento);
        assertEquals(VALOR_DEFAULT, instance.getImporteConDescuento(), 0.01);
        // Descuento mas del maximo
        descuento = 110.5;
        instance.setDescuentoPorcentual(descuento);
        assertEquals(VALOR_DEFAULT, instance.getImporteConDescuento(), 0.01);
        // Descuento maximo
        descuento = 100.0;
        instance.setDescuentoPorcentual(descuento);
        assertEquals(0, instance.getImporteConDescuento(), 0.01);
        // Sin descuento
        descuento = 0.0;
        instance.setDescuentoPorcentual(descuento);
        assertEquals(VALOR_DEFAULT * (1 - (descuento / 100)), instance.getImporteConDescuento(), 0.01);
        // Cambiamos el importe bruto y cambiamos el descuento
        instance.setImporteBruto(15.50);
        assertEquals(15.50, instance.getImporteBruto(), 0);
        instance.setDescuentoPorcentual(15.0);
        assertEquals(15.50 * 0.85, instance.getImporteConDescuento(), 0.01);
    }
}
