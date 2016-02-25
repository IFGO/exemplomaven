/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.figuras;

/**
 *
 * @author aluno
 */
public class Quadrado extends FiguraGeometrica {

    Double lado;
    
    public Quadrado(Double lado) {
        this.lado = lado;
    }
    
    @Override
    public Double getArea() {
       return this.lado * this.lado;
    }

    @Override
    public Double getPerimetro() {
        return 4 * this.lado;
    }
    
}
