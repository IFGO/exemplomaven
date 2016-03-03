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
public class RetanguloTest {
    
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
    public void deveCalcularAreaCorretamente(){
        Retangulo retangulo = new Retangulo(4L,8L);
        assertEquals(32L,(double) retangulo.getArea(), 0);
        
    }
    
    @Test
    public void deveCalcularPerimetroCorretamente(){
        Retangulo retangulo = new Retangulo(4L,8L);
        assertEquals(24L,(double) retangulo.getPerimetro(), 0);   
    }

}
