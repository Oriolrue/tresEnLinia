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

    //El metodo jugar deberia devolver boolean
    public void jugar(int fila, int columna){
        tablero[fila][columna] = 'x';
    }

    //jE* = jugadaExpected y un numero
    public boolean jugadaGanadora(int fila, int columna){
        char[][] jE1 = {{'x','-','-'},{'x','-','-'},{'x','-','-'}};
        char[][] jE2 = {{'-','x','-'},{'-','x','-'},{'-','x','-'}};
        char[][] jE3 = {{'-','-','x'},{'-','-','x'},{'-','-','x'}};
        char[][] jE4 = {{'x','x','x'},{'-','-','-'},{'-','-','-'}};
        char[][] jE5 = {{'-','-','-'},{'x','x','x'},{'-','-','-'}};
        char[][] jE6 = {{'-','-','-'},{'-','-','-'},{'x','x','x'}};
        char[][] jE7 = {{'x','-','-'},{'-','x','-'},{'-','-','x'}};
        char[][] jE8 = {{'-','-','x'},{'-','x','-'},{'x','-','-'}};
        if (jE1 == tablero || jE2 == tablero || jE3 == tablero || jE4 == tablero || jE5 == tablero || jE6 == tablero || jE7 == tablero || jE8 == tablero){
            return true;
        }
        else
            return false;
    }
}