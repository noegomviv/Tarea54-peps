/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.gva.edu.alu.noegomviv.tarea.ngv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Noelia
 */
public class CuadradoTest {
    private static Cuadrado c0;
    private static Cuadrado c1;
    private static Cuadrado c8;
    private static Cuadrado cn5;
    private static String s="";
    
    public CuadradoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() {
        c0=new Cuadrado(0);
        c1=new Cuadrado(1);
        c8=new Cuadrado(8);
        cn5=new Cuadrado(-5);
        s=c8.toString();
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of getLado method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testGetLado() {
        System.out.println("getLado");
        Cuadrado instance = c0;
        int expResult = 0;
        int result = instance.getLado();
        assertEquals(expResult, result);
        assertEquals(c1.getLado(), 1);
        assertEquals(c8.getLado(), 8);
        assertEquals(cn5.getLado(), 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setLado method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testSetLado() {
        System.out.println("setLado");
        int lado = 10;
        Cuadrado instance = new Cuadrado(10);
        instance.setLado(lado);
        int r=instance.getLado();
        assertEquals(r, 10);
        // TODO review the generated test code and remove the default call to fail.
         }

    @Test
        public void testToString() {
        System.out.println("toString");
        Cuadrado instance = c8;
        String expResult = s;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of calclularArea method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testCalclularArea() {
        System.out.println("calclularArea");
        Cuadrado instance = c0;
        double expResult = 0.0;
        double result = instance.calclularArea();
        assertEquals(expResult, result, 0);
        
        result = cn5.calclularArea();
        assertEquals(expResult, result, 0);

        expResult = 1.0;
        result = c1.calclularArea();
        assertEquals(expResult, result, 0);

        expResult = 64.0;
        result = c8.calclularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularPerimetro method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Cuadrado instance = c0;
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        
        
        result = cn5.calcularPerimetro();
        assertEquals(expResult, result, 0);

        expResult = 4.0;
        result = c1.calcularPerimetro();
        assertEquals(expResult, result, 0);

        expResult = 32.0;
        result = c8.calcularPerimetro();
        assertEquals(expResult, result, 0);
        
        // TODO review the generated test code and remove the default call to fail.  
    } 
}
