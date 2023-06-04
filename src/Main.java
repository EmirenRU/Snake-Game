import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Snake");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new SnakeGame());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }).start();
    }
}