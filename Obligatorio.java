package obligatorio;
/*
Juan Rodríguez 225931
Tomás Bañales 239825
 */
import java.util.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;

public class Obligatorio {
    
    public static void main(String[] args){
        Obligatorio.registroUsuario(args);
        Obligatorio.horapartida(args);
        Obligatorio.mostrarTablero();
    }
    
    public static void mostrarTablero(){
        int largoyancho = 13;
        int[][] tablero = new int [largoyancho][largoyancho];
                       for (int i = 0; i < largoyancho; i++){
                    for (int j = 0; j < largoyancho; j++){
                        if((i % 2) != 0 && j > 0 && (j % 2) == 0) {
                            System.out.print("|");
                        }
                        else if((i % 2) != 0 && j == 0) {
                            System.out.print("|");
                                }
                        else if((i % 2) != 0 && (j % 2) != 0) {
                            System.out.print(" ");
                        }
                        if((i % 2) == 0) {
                            if((j % 2) == 0 || j == 0) {
                            System.out.print("\u001B[42m+");
                            }
                            else if((j % 2) != 0) {
                            System.out.print("\u001B[42m-");
                            }
                        }
                    }
                    System.out.println();
                }
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
    public static void horapartida(String[] args){
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        // "dd-MM-yyyy HH:mm:ss" formato con fecha
        String formatDateTime = now.format(format);  
        System.out.println("Hora de la partida: " + formatDateTime);
    }
        
}