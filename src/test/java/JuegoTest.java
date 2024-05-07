import org.junit.jupiter.api.Assertions;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void nuevaPartida() {
        Juego j = new Juego();

        char[][] matrix = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};

        Assertions.assertArrayEquals(matrix,j.getTablero());
        Assertions.assertEquals(1, j.getTurno());
    }

    @org.junit.jupiter.api.Test
    void jugar() {
        Juego j = new Juego();
        //Assertions.assertEquals();
    }
}