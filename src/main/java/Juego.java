import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

public class Juego{
    Scanner sc = new Scanner(System.in);

    private char[][] tablero;
    private int turno;

    public char[][] getTablero() {return tablero;}

    public short getTurno() {
        return (short) turno;
    }

    public Juego(){
        this.tablero = new char[][]{{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        nuevaPartida();
    }

    public void nuevaPartida(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
        turno = 1;
    }
    public static void jugar(int fila, int columna){
        throw new NotImplementedException();
    }
    public static boolean jugadaGanadora(int fila, int columna){
        throw new NotImplementedException();
    }
}