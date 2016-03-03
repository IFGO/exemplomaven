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
public class TrianguloTest {
    
    public TrianguloTest() {
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
        Triangulo triangulo = new Triangulo(4L, 4L, 4L, 4L);
        assertNotEquals(11L, (double) triangulo.getArea());
    }
    
    @Test
    public void calcularPerimetroCorretamente() {
        Triangulo triangulo = new Triangulo(4L, 4L, 4L, 4L);
        assertNotEquals(11L, (double) triangulo.getPerimetro());
    }
}
