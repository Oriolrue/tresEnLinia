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

    @org.junit.jupiter.api.Test
    void jugar_00() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'x','-','-'}, {'-','-','-'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[0][0], actualMatrix[0][0]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_01() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','x','-'}, {'-','-','-'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[0][1], actualMatrix[0][1]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_02() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','x'}, {'-','-','-'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[0][2], actualMatrix[0][2]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_10() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'x','-','-'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[1][0], actualMatrix[1][0]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_11() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'-','x','-'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[1][1], actualMatrix[1][1]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_12() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'-','-','x'}, {'-','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[1][2], actualMatrix[1][2]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_20() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'-','-','-'}, {'x','-','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[2][0], actualMatrix[2][0]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_21() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'-','-','-'}, {'-','x','-'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[2][1], actualMatrix[2][1]='x');
    }
    @org.junit.jupiter.api.Test
    void jugar_22() {
        Juego j = new Juego();
        char[][] expectedMatrix = {{'-','-','-'}, {'-','-','-'}, {'-','-','x'}};
        char[][] actualMatrix = j.getTablero();

        Assertions.assertEquals(expectedMatrix[2][2], actualMatrix[2][2]='x');
    }
   /* @org.junit.jupiter.api.Test
    void jugadaGanadora(){
        Juego j = new Juego();
        char[][] actualMatrix = j.getTablero();
        Assertions.assertEquals(false, actualMatrix);
    }*/

}