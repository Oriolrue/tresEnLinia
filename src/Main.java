import java.util.Locale;
import java.util.Scanner;

public class Main extends TUI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        mostrarMenu();
    }
}