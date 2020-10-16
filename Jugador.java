/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Jugador {
    private String nombre;
    private int edad;
    
    public Jugador(String nombre, int edad){

           this.nombre = nombre;
           this.edad = edad;

    }
    
    public void setNombre(String nombre){

     this.nombre = nombre;

    }
    
    public String getNombre(){
        return this.nombre;    
    }
    
    public void setEdad(int edad){

     this.edad = edad;

    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public static void registroUsuario(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre jugador uno");
        String nom1 = in.nextLine();
        System.out.println("Ingrese edad jugador uno");
        int edad1 = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese nombre jugador dos");
        String nom2 = in.nextLine();
        System.out.println("Ingrese edad jugador dos");
        int edad2 = in.nextInt();
        System.out.println("Jugador uno: "+nom1+", edad: "+edad1);
        System.out.println("Jugador dos: "+nom2+", edad: "+edad2);
    }
}
