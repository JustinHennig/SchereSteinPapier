
import java.util.Scanner;

public class Game {
    public static void main ( String [] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Willst du Schere Stein Papier spielen? (Y/N): ");
            String wahl = scanner.nextLine();

            System.out.println(wahl);

            if ("Y".equals(wahl)) {
                System.out.println("Schere, Stein oder Papier?");
            }
    }
}
