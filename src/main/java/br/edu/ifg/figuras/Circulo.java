/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.figuras;

/**
 *
 * @author Victor
 */
public class Circulo extends FiguraGeometrica{
    private Long raio;
    
    public Circulo(Long raio){
        this.raio = raio;
    }
    
    @Override
    public double getArea() {
       return (long) Math.PI * (long) Math.pow(raio, 2);
    }

    
    @Override
    public double getPerimetro() {
        return (2 * ((long) Math.PI))  * raio; 
    }
    
}
