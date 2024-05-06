import org.junit.jupiter.api.Assertions;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void nuevaPartida() {
        Juego j = new Juego();
        j.getTablero();
        //Assertions.assertEquals(j.getTablero(),j.getTablero());
        Assertions.assertEquals(1, j.getTurno());
    }

    @org.junit.jupiter.api.Test
    void jugar() {
        Juego j = new Juego();
        //Assertions.assertEquals("x", j.getTablero());
    }
}