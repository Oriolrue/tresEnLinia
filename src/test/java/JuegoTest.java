import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void nuevaPartida() {
        Juego j = new Juego();
        char[][] matrix = {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};

        Assertions.assertArrayEquals(matrix,j.getTablero());
        Assertions.assertEquals(1, j.getTurno());
    }

    @ParameterizedTest
    @CsvSource({"'x','-','-','-','-','-','-','-','-'", "'-','x','-','-','-','-','-','-','-'", "'-','-','x','-','-','-','-','-','-'"})
    void jugar() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertArrayEquals(expectedMatrix, actualMatrix);
    }

}