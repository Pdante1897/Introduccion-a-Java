/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.curso.clase5;

import com.curso.clase5.clases.Vehiculo;
import com.curso.clase5.clases.Circulo;
import com.curso.clase5.clases.Rectangulo;
import com.curso.clase5.clases.Figura;
import com.curso.clase5.clases.Carro;
import com.curso.clase5.clases.Moto;
/**
 *
 * @author gerar
 */
public class Clase5 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Rojo", 5);
        //circulo1.info();
        
        Rectangulo rectangulo1 = new Rectangulo("Negro");
        //rectangulo1.info();
        
        Figura[] figuras = {circulo1, rectangulo1};
        
        for(Figura f : figuras){
            f.info();
        }
        
        System.out.println("----------------------------------");
        
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        carro.ingresar();
        
        moto.ingresar();
        
    }
    
    
    
    
    public void clase5(){
        System.out.println("Hello World!");
        Vehiculo auto = new Vehiculo("Mazda", "Rojo Cherry", 2024);
        
        System.out.println("Marca del objeto Carro: " + auto.getMarca());
        System.out.println("Color del objeto Carro: " + auto.getColor());
        System.out.println("Anio del objeto Carro: " + auto.getAnio());
        
        auto.setMarca("Volkswagen");
        auto.setColor("Negro");
        auto.setAnio(2026);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Marca del objeto Carro: " + auto.getMarca());
        System.out.println("Color del objeto Carro: " + auto.getColor());
        System.out.println("Anio del objeto Carro: " + auto.getAnio());
        
        auto.arrancar();
        auto.cambiarMarcha();
        System.out.println(auto.toString());
        
        Vehiculo auto2 = new Vehiculo();
        auto2.arrancar();
    } 
}
