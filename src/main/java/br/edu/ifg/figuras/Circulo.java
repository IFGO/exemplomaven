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
        if(true) {
            for(int i = 0; i<5; i++) {
                if(false) {
                    for(i = 0; i<5; i++) {
                     for(i = 0; i<5; i++) {
                     if(false) {
                    for(i = 0; i<5; i++) {
                     for(i = 0; i<5; i++) {
                    
                    }
                    }
                    }
                    }
                }
            }
        }
       
    }
    return (double) Math.PI * (double) Math.pow(raio, 2);}

    
    @Override
    public double getPerimetro() {
        return (2 * ((double) Math.PI))  * raio; 
    }
    
}
