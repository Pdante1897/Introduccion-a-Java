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
        String[] frutas = {"mango", "pera", "kiwi", "uva", "melon"};
        String busqueda = "sandia";
        boolean encontrado = false;
        
        int posicion = -1;
        
        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals(busqueda)) {
                encontrado = true; 
                posicion = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Encontrado en la posicion: " + posicion);
        }else{
            System.out.println("No se encontro");
        }
        
    }
    
    public static void Clase4Ventas(){
        int [][] ventas = {
            {200, 350, 150}, // sem 1
            {400, 220, 310},// sem 2 
            {180, 500, 270} //sem 3
        };
        
        for (int i = 0; i < ventas.length; i++) {
            int sumaSemana = 0;
            for (int j = 0; j < ventas[0].length; j++) {
                sumaSemana += ventas[i][j];
            }
            System.out.println("Semana " + (i + 1) + ": " + sumaSemana);
        }
    }
    
    public static void Clase4ForMatrices(){
        int index = 3;
        int [][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println("---------------For------------------");
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------For Each---------------");
        
        for(int[] fila : mat){
            for(int valor : fila){
                System.out.print(valor);
            }
            System.out.println();
        }
        
    }
    
    public static void Clase4Promedio(){
         int [] notas = {85, 92, 78, 95, 88};
        int suma = 0, maximo = notas[0];
        
        for(int nota : notas){
            suma += nota;
            if (nota > maximo) maximo = nota;
        }
        
        double promedio = (double)suma / notas.length;
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota Maxima: " + maximo);
    }
    
    public static void Clase4For(){
        System.out.println("inicializcion y recorrido de vectores");
        int [] nums = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("La posicion: " + i + " es igual a: " + nums[i]);
        }
        
        System.out.println("---------------For en reversa--------------------");
        
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("La posicion: " + i + " es igual a: " + nums[i]);
        }
        
        //for each  
        System.out.println("----------------Con For Each------------------");
        for(int numero : nums){
            System.out.println("numero es: " + numero);
        }
    }
    
    public static void Clase3Ciclos(){
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("----------------------");
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
        
        int x = 0;
        while(x < 10){
            System.out.println("x = " + x);
            x ++;
        }
    }
    
    public static void clase3Dowhile(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-------------------Elije una opcion :D ----------------");
            System.out.println("1. Clase1");
            System.out.println("2. Clase2");
            System.out.println("3. Clase3");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                clase1();
            }else if(opcion == 2){
                clase2();
            }else if(opcion == 3){
                clase3();
            }else if (opcion == 4) {
                System.out.println("Has elegido salir! :0");
            }else{
                System.out.println("No se reconoce la opcion");
            }
            
        } while (opcion != 4);
    
    }
    
    
    public static void clase3(){
        System.out.println("----------------Ciclo For--------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("suma = " + suma);
        System.out.println("-----------------------------------------------");
        
        System.out.println("-------------------Ciclo While ----------------");
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el secreto");
        int secreto = scanner.nextInt(), intento = 0; 
        
        while(intento != secreto){
            intento++;
            System.out.println("Intento: " + intento);
        }
        
        System.out.println("----------------Ejemplo de salida del while");
        
        int num = -1;
        while (num != 0){
            num = scanner.nextInt();
            System.out.println("Leido: " + num);
        }
        
        System.out.println("--------------------------------------------");
    
    }
    
    
    public static void clase2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Puede entrar");
        }else{
            System.out.println("No puede entrar");
        }
    }
    
    public static void clase1(){
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
