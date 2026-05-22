/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.curso.ejemploclase1;


import java.util.Scanner;
/**
 *
 * @author gerar
 */
public class EjemploClase1 {
    //Esta funcion es la principal 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Puede entrar");
        }else{
            System.out.println("No puede entrar");
        }
        
        
    }
    
    public void funcion2(){
        System.out.println("Hola! Este es el curso de introduccion a Java :3");
        int edad = 15;
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
        System.out.println("-------------------------------------------------------");
        
        
        /*  Conectores logicos
            !      not (niega o invierte el resultado de una condicion) !true = false
            !a = b
            !true = fasle 
            !false = true
            
            &&     and (la todas sus condiciones deben ser true para que devuelva un true)
            a && b = c
            true && true = true
            false && true = false
            false && true = false 
            false && fasle = false
            
            ||  or (para que sea true el resultado, debe de haber al menos un true entre sus condiciones)
            
            a || b = c
            true || true = true
            true || false = true
            false || true = true
            false || false = false 
            
        */
        System.out.println("------------------Instrucciones de control IF --------------");

        if((edad >= 18) && (altura > 1.70)){
            System.out.println("Eres mayor de edad o tu altura es mayor a 1.70");
        }else if (edad >= 15){
            System.out.println("Eres mayor de 15 pero menor de 18");
        }else if(edad >= 10){
            System.out.println("Eres mayor de 10 pero menor de 15");
        }else{
            System.out.println("No cumples las condiciones");
        }
        System.out.println("------------------Instrucciones de control switch --------------");
        
        int opciones = 1;
        
        switch(opciones){
            case 1:
                System.out.println("Este es el caso 1");
                break;
            case 2:
                System.out.println("Este es el caso 2");
                break;
            case 3:
                System.out.println("Este es el caso 3");
                break;
            default:
                System.out.println("Este es el default");
        }

        
    }
}
