import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        TUI TUI = new TUI();
        Juego Juego = new Juego();

        //TUI.mostrarMenu();
        Juego.nuevaPartida();
    }
}