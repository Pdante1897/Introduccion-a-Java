/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clase5.clases;

/**
 *
 * @author gerar
 */
public abstract class Figura {
    public String color; 

    public Figura(String color) {
        this.color = color;
    }
    
    public void info(){
        System.out.println("Color :" + color + " Area: " + area());
    }
    
    public abstract double area();

}
