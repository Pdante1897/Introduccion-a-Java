/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.curso.ejemploclase1;

/**
 *
 * @author gerar
 */
public class EjemploClase1 {
    //Esta funcion es la principal 
    public static void main(String[] args) {
        System.out.println("Hola! Este es el curso de introduccion a Java :3");
        int edad = 27;
        //estatutra en metros
        double estatura = 1.73;
        String nombre = "Ana Isabel";
        char genero = 'F';
        System.out.println("-------------------------------------------------------");
        System.out.println(nombre);
        System.out.println("Tiene la edad de: " + edad + " anios");
        System.out.println("Tiene una estatura de: " + estatura + "m");
        System.out.println("Genero: " +genero);
        System.out.println("-------------------------------------------------------");
        System.out.println("------------------Calcular area triangulo--------------");
        double altura = 5;
        double base = 3;
        double areaEntera = (altura * base)/2;
        
        System.out.println("El area del triangulo es: " + areaEntera);
    }
    
    public void funcion2(){
        
    }
}
