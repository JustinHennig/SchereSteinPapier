import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int computer_choice = random.nextInt(3);

            System.out.println();
            System.out.println("Schere, Stein oder Papier?");
            String choice = scanner.next().toLowerCase();

            switch (computer_choice) {
                case 0:
                    System.out.println("Computer wählt Schere");
                    break;
                case 1:
                    System.out.println("Computer wählt Stein");
                    break;
                case 2:
                    System.out.println("Computer wählt Papier");
                    break;

            }

            if ((choice.equals("schere") && computer_choice == 2) || (choice.equals("stein") && computer_choice == 0) || (choice.equals("papier") && computer_choice == 1)) {
                System.out.println("Du gewinnst!");
            } else if ((choice.equals("schere") && computer_choice == 1) || (choice.equals("stein") && computer_choice == 2) || (choice.equals("papier") && computer_choice == 0)) {
                System.out.println("Du verlierst!");
            } else {
                System.out.println("Unentschieden!");
            }

            System.out.print("Nochmal? (y/n): ");
            String play_again = scanner.next().toLowerCase();

            if (!play_again.equals("y")) {
                System.out.println("Spiel beendet 👋");
                break;
            }
        }
    }
}
