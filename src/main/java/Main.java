public class Main{
    static TUI TUI = new TUI();
    static Juego Juego = new Juego();

    public static void main(String[] args) {

        while (true) {
            int opcion = TUI.mostrarMenu();

            switch (opcion) {
                case 1:
                    Main.nuevaPartida();
                    return;
                case 2:
                    // Load a saved game
                    break;
                case 3:
                    // configuration options
                    break;
                case 4:
                    return; // Exit the program
                default:

            }
        }

        // aqui tiene que haber metodo nuevapartida() con un switch, que pida una nueva partida a "Juego"
        // pedimos tablero a juego y a tui le pedimos que muestre el tablero
        // pedirle al jugador 1 la jugada a tui y que se lo devuelva a main y que llame a juego para que haga la jugada
        // tui y juego no se pueden comunicar directamente entre ellos
    }

    public static void nuevaPartida(){
        TUI.mostrarTablero(Juego.getTablero(), Juego.getTurno());
    }
}