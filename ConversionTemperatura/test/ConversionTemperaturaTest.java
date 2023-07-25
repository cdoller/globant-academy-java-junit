/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import conversiontemperatura.ConversionTemperatura;
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
public class ConversionTemperaturaTest {
    
    private ConversionTemperatura conversor;
    
    public ConversionTemperaturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        conversor = new ConversionTemperatura();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test Constructor , 0 celcius
     */
    @Test
    public void debeInicializarCon0Celcius(){
        assertEquals(0, conversor.getTemperaturaCelcius(), 0);
        assertEquals(32, conversor.getTemperaturaFahrenheit(), 0);
        assertEquals(273.15, conversor.getTemperaturaKelvin(), 0);
    }
    
    /**
     * Test set convertir unidades de Celcius al resto
     */
    @Test
    public void debeConvertirTodasLasUnidadesCelcius(){
        conversor.setTemperaturaCelcius(50.0);
        assertEquals(50.0, conversor.getTemperaturaCelcius(), 0.001);
        assertEquals(122.0, conversor.getTemperaturaFahrenheit(), 0.001);
        assertEquals(323.15, conversor.getTemperaturaKelvin(), 0.001);
    }
    
    /**
     * Test set convertir unidades de Fahrenheit al resto
     */
    @Test
    public void debeConvertirTodasLasUnidadesFahrenheit(){
        conversor.setTemperaturaFahrenheit(120.0);
        assertEquals(48.8889, conversor.getTemperaturaCelcius(), 0.001);
        assertEquals(120.0, conversor.getTemperaturaFahrenheit(), 0.001);
        assertEquals(322.0389, conversor.getTemperaturaKelvin(), 0.001);
    }
    
    /**
     * Test set convertir unidades de Fahrenheit al resto
     */
    @Test
    public void debeConvertirTodasLasUnidadesKelvin(){
        conversor.setTemperaturaKelvin(98.0);
        assertEquals(-175.15, conversor.getTemperaturaCelcius(), 0.001);
        assertEquals(-283.27, conversor.getTemperaturaFahrenheit(), 0.001);
        assertEquals(98.0, conversor.getTemperaturaKelvin(), 0.001);
    }
    
    /**
     * Temperatura invalida
     */
    @Test
    public void debeResetearConTemperaturaInvalida(){
        conversor.setTemperaturaKelvin(-10.0);
        assertEquals(0, conversor.getTemperaturaCelcius(), 0);
        assertEquals(32, conversor.getTemperaturaFahrenheit(), 0);
        assertEquals(273.15, conversor.getTemperaturaKelvin(), 0);
        conversor.setTemperaturaCelcius(-300.0);
        assertEquals(0, conversor.getTemperaturaCelcius(), 0);
        assertEquals(32, conversor.getTemperaturaFahrenheit(), 0);
        assertEquals(273.15, conversor.getTemperaturaKelvin(), 0);
        conversor.setTemperaturaFahrenheit(-500.0);
        assertEquals(0, conversor.getTemperaturaCelcius(), 0);
        assertEquals(32, conversor.getTemperaturaFahrenheit(), 0);
        assertEquals(273.15, conversor.getTemperaturaKelvin(), 0);
    }
}
