import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Nova partida");
        System.out.println("Carregar partida");
        System.out.println("Configuració");
        System.out.println("Sortir");

        String opcion = sc.nextLine();

    }
}