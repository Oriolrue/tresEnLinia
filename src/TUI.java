import java.util.Locale;
import java.util.Scanner;

public class TUI {
    public static void nuevaPartida(){

    }
    public static void cargarPartida(){

    }
    public static void configuracion(){

    }
    public static void salir(){

    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        while (true){
            System.out.println("Escoge una opción:");
            System.out.println(" ");
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Configuración");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Se ha escogido nueva partida");
                    break;
                case 2:
                    System.out.println("Se ha escogido cargar partida");
                    break;
                case 3:
                    System.out.println("Se ha escogido configuración");
                    break;
                case 4:
                    System.out.println("Se ha escogido salir");
                    break;
                default:
                    System.out.println("Opción no existente");
            }
        }
    }
}