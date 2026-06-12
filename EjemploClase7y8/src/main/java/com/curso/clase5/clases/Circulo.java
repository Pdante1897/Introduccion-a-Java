/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clase5.clases;
/**
 *
 * @author gerar
 */
public class Circulo extends Figura {
    
    public double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    public double area(){
        System.out.println("Se esta calculando el area de un circulo");
        return 3.1416*Math.pow(radio, 2);
    }
}
