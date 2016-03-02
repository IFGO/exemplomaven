/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.figuras;

/**
 *
 * @author FABRICIO
 */
public class Triangulo extends FiguraGeometrica{
    
    Long Base;
    Long Altura;
    Long LadoA;
    Long LadoB;
    
    public Triangulo(Long Base, Long Altura, Long LadoA, Long LadoB) {
        this.Base = Base;
        this.Altura = Altura;
        this.LadoA = LadoA;
        this.LadoB = LadoB;
    }    
    
    @Override
    public double getArea() {
        return (Base*Altura)/2;
    
    }

    @Override
    public double getPerimetro() {
        return LadoA+LadoB+Base;
        
    }
    
}
