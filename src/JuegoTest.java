import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void nuevaPartida() {
        Juego j = new Juego();
        Assertions.assertEquals(1, j.getTurno());
        Assertions.assertEquals('-', j.getTablero());
    }

    @org.junit.jupiter.api.Test
    void jugar() {
        Juego j = new Juego();
        Assertions.assertEquals("x", j.getTablero());
    }
}