/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clase5.clases;

/**
 *
 * @author gerar
 */
public class Rectangulo extends Figura {
    public double base;
    public double altura;
    
    
    public Rectangulo(String color) {
        super(color);
    }
    
    public double area(){
        System.out.println("Se esta calculando el area de un rectangulo");
        return this.base * this.altura;
    }
}
