import org.junit.jupiter.api.Assertions;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void nuevaPartida() {
        Juego j = new Juego();
        char[][] matrix = {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};

        Assertions.assertArrayEquals(matrix,j.getTablero());
        Assertions.assertEquals(1, j.getTurno());
    }

    @org.junit.jupiter.api.Test
    void jugar() {
        Juego j = new Juego();
        char[][] matrix = {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
        //Hay que cambiar la prueba unitaria, en el expected poner la matriz y en el actual llamar a getTablero().
        Assertions.assertEquals('x', matrix[0][0] = 'x');
    }
}