package obligatorio;

/*
Juan Rodríguez 225931
Tomás Bañales 239825
 */
import static java.lang.System.in;
import java.util.*;

public class Obligatorio {

    public static void main(String[] args) {
//             Obligatorio.registroUsuario(args);
        Partida.horaJugada(args);
        Obligatorio.mostrarTablero();
//        Partida p1 = new Partida();
//        System.out.println(p1.getHora());
    }

    public static void mostrarTablero() {
        int[][] visualizacion = new int[13][13];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if ((i % 2) != 0 && j > 0 && (j % 2) == 0) {
                    System.out.print("|");
                } else if ((i % 2) != 0 && j == 0) {
                    System.out.print("|");
                } else if ((i % 2) != 0 && (j % 2) != 0) {
                    System.out.print(visualizacion[i][j]);
                }
                if ((i % 2) == 0) {
                    if (i == 0 && (j % 2) == 0) {
                        System.out.print("\u001B[42m+");
                    } else if (i == 12 && (j % 2) == 0) {
                        System.out.print("\u001B[42m+");
                    } else if (i != 0 && i != 12 && (j % 2) == 0) {
                        System.out.print("\u001B[0m+");
                    } else if (i == 0 && (j % 2) != 0) {
                        System.out.print("\u001B[42m-");
                    } else if (i == 12 && (j % 2) != 0) {
                        System.out.print("\u001B[42m-");
                    } else {
                        System.out.print("\u001B[0m-");
                    }
                }
            }
            System.out.println();
        }
    }

}
