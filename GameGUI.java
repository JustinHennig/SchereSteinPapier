import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame {

    public GameGUI() {
        setTitle("Schere Stein Papier");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
