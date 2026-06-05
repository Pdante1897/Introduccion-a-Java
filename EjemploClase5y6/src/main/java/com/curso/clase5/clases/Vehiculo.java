/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clase5.clases;

/**
 *
 * @author gerar
 */
public class Vehiculo {
    
    String marca;
    String color;
    int anio;

    public Vehiculo() {
    }

    
    public Vehiculo(String marca, String color, int anio) {
        this.marca = marca;
        this.color = color;
        this.anio = anio;
    }
    
    public void cambiarMarcha(){
        System.out.println("se Cambio de marcha");
    }
    
    public void ingresar(){
        System.out.println("Ingreso al veiculo generico");
    }
    
    public void arrancar(){
        System.out.println("Ruuun");
        cambiarMarcha();
    }
    
    public void frenar(){
        System.out.println("Frenar!");
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", color=" + color + ", anio=" + anio + '}';
    }
    
}
