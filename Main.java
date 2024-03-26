import javax.swing.*;

public class Main {

    public static void main(String[] args) {
         
        int boardWidth = 600;
        int boardHeight = boardWidth ;

        JFrame frame = new JFrame("snake");
        frame.setVisible(true);
        frame.setSize(boardHeight, boardWidth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snake = new SnakeGame(boardWidth, boardHeight);
        frame.add(snake);
        frame.pack();
        snake.requestFocus();
    }
}