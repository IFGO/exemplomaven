/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class QuadradoTest {
    
    public QuadradoTest() {
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

    @Test
    public void calcularAreaCorretamente() {
        Quadrado quadrado = new Quadrado(3L);
        assertEquals(9L, (long) quadrado.getArea());
        assertNotEquals(11L, (long) quadrado.getArea());
    }
    
    @Test
    public void calcularPerimetroCorretamente() {
        Quadrado quadrado = new Quadrado(3L);
        assertEquals(12L, (long) quadrado.getPerimetro());
        assertNotEquals(11L, (long) quadrado.getPerimetro());
    }
}
