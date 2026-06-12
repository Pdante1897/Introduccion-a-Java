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
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;
/**
 *
 * @author gerar
 */
public class Clase5 {

    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter( new FileWriter("reporte.txt"))){
            pw.println("-------------Reporte---------------");
            pw.println("Estudiante: Mario");
            pw.printf("Nota: %.1f%%" , 95.5);
            pw.println();
            pw.println("Estudiante: Luis");
            pw.printf("Nota: %.1f%%\n" , 88.0);
        }catch(IOException e){
        }
    }
    
    public static void clase8_ej1(){
        //clase 8
        try{
            FileWriter fw = new FileWriter("Ejemplo.txt", true);
            fw.write("Hola mundo esta es la cadena de la clase 8 \n");
            fw.write("esta es la segunda linea \n");
            fw.write("Esta sigue siendo la segunda linea");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("notas.txt", false))){ 
            bw.write("Estudiantes ; Notas ");
            bw.newLine();
            bw.write("Ana ; 10");
            bw.newLine();
            bw.write("Jimena ; 9");
            bw.newLine();
            bw.write("Jaqueline ; 9.5");
            bw.newLine();
        } 
        catch(IOException e){
            e.printStackTrace();
        }
        //bufferedreader
        try(BufferedReader br = new BufferedReader(new FileReader("notas.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Archivo no existe");
        }
        
        try (Scanner sc = new Scanner(new File("Ejemplo.txt"))){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void clase7_main(){
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Numerador: ");
            int num = Integer.parseInt(scn.nextLine());
            
            System.out.println("Denominador: ");
            int denom = Integer.parseInt(scn.nextLine());
            denominador(denom);
            System.out.println("Resultado: " + (num/denom));
        }catch(NumberFormatException e){
            System.out.println("Debes ingresar solo Numeros!");
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0!");
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Calculadora cerrada");
        }
    }
    
    public static void denominador(int denom){
        if(denom == 0){
            throw new IllegalArgumentException("El numero ingresado es 0, es ilegal");
        }
        
    }
    
    public void clase7(){
    
        try{
            int[] vector =  {1,2,3};
            System.out.println(vector[5]); 
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Excepcion controlada");
        }
        
        try{
            int div = 5/0;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println("Error de divir dentro de 0");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Error Generico");
            System.out.println(e);
        }finally{
            System.out.println("Fin del intento");
        }
        
        
        Scanner scn = new Scanner(System.in);
        int option;
        while(true){
            
            try{
                System.out.println("Ingrese un numero");
                option = scn.nextInt();
                System.out.println("se ingreso el numero: " + option);
            }catch(Exception error){
                System.out.println("Error, tipo de dato incorrecto " + error);
                scn = new Scanner(System.in);
                
            }finally {
                System.out.println("Operacion terminada");
            }
        }
        
        
    }
    
    public void clase6(){
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
