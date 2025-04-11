import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 750;
        int boardHeight = 250;

        JFrame frame = new JFrame("Chrome Dinosaur");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        DinosaurGame game = new DinosaurGame();
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        game.requestFocus();
    }
}
