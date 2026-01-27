import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game extends JFrame {

    JLabel statusLabel = new JLabel("Wähle Schere, Stein oder Papier");
    JLabel playerLabel = new JLabel("Du: -");
    JLabel computerLabel = new JLabel("Computer: -");
    JLabel resultLabel = new JLabel("Ergebnis: -");

    JButton schereButton = new JButton("Schere");
    JButton steinButton = new JButton("Stein");
    JButton papierButton = new JButton("Papier");


    public Game() {
        setTitle("Schere Stein Papier");
        setVisible(true);
        setSize(500, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(new BorderLayout());

        JPanel statusPanel = new JPanel();
        statusPanel.add(statusLabel);
        add(statusPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 3, 2, 2));
        centerPanel.add(playerLabel);
        centerPanel.add(computerLabel);
        centerPanel.add(resultLabel);
        add(centerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(schereButton);
        buttonPanel.add(steinButton);
        buttonPanel.add(papierButton);
        add(buttonPanel, BorderLayout.SOUTH);

        schereButton.addActionListener(e -> play("schere"));
        steinButton.addActionListener(e -> play("stein"));
        papierButton.addActionListener(e -> play("papier"));
    }

    private void play(String playerMove) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computer_choice = random.nextInt(3);
        String computer_move = switch (computer_choice) {
            case 0 -> "schere";
            case 1 -> "stein";
            case 2 -> "papier";
            default -> "-";
        };

        playerLabel.setText("Du: " + playerMove);
        computerLabel.setText("Computer: " + computer_move);

        String result = determineResult(playerMove, computer_move);
        resultLabel.setText("Ergebnis: " + result);
    }

    private String determineResult(String playerMove, String computerMove) {
        if (Objects.equals(playerMove, computerMove)) {
            return "Unentschieden!";
        }

        boolean win = (playerMove.equals("schere") && computerMove.equals("papier") ||
                        playerMove.equals("stein") && computerMove.equals("schere") ||
                        playerMove.equals("papier") && computerMove.equals("stein"));

        return win ? "Du gewinnst!" : "Du verlierst!";
    }
}
