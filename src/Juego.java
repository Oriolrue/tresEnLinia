import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Juego{
    private char tablero;
    private short turno;

    public char getTablero() {
        return tablero;
    }

    public short getTurno() {
        return turno;
    }

    public void nuevaPartida(){
        throw new NotImplementedException();
    }
    public static void jugar(short fila, String columna){
        throw new NotImplementedException();
    }
    public static boolean jugadaGanadora(short fila, short columna){
        throw new NotImplementedException();
    }
}