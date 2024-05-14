import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

public class TUI{
    static Scanner sc = new Scanner(System.in);

    public static void mostrarTablero(char[][] tablero, short turno){
        System.out.println("Es el turno del jugador " + turno);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }
    public static short recogerJugada(){
        throw new NotImplementedException();
    }
    public static void finDePartida(short ganador){
        throw new NotImplementedException();
    }

    public static int mostrarMenu(){
        System.out.println("Escoge una opción:");
        System.out.println(" ");
        System.out.println("1. Nueva partida");
        System.out.println("2. Cargar partida");
        System.out.println("3. Configuración");
        System.out.println("4. Salir");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println(" ");
                System.out.println("Se ha escogido nueva partida");
                break;
            case 2:
                 System.out.println(" ");
                 System.out.println("Se ha escogido cargar partida");
                 break;
            case 3:
                 System.out.println(" ");
                 System.out.println("Se ha escogido configuración");
                 break;
            case 4:
                 System.out.println(" ");
                 System.out.println("Se ha escogido salir");
                 break;
            default:
                 System.out.println(" ");
                 System.out.println("Opción no existente");
            }
        return opcion;
    }
}