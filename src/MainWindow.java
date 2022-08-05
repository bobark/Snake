import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow (){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(375,375);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow mv = new MainWindow();

    }
}
