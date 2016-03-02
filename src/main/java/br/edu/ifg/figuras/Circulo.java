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
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double getArea() {
       return (double) Math.PI * (double) Math.pow(raio, 2);
    }

    
    @Override
    public double getPerimetro() {
        return (2 * ((double) Math.PI))  * raio; 
    }
    
}
