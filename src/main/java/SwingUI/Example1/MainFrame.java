package SwingUI.Example1;

import javax.swing.JFrame;
import java.awt.Color;

public class MainFrame extends JFrame {
    
    public static int WIDTH = 960;
    public static int HEIGHT = 540;


    public MainFrame() {
        super();

        this.setSize(WIDTH, HEIGHT);

        //Show in the center of screen
        this.setLocationRelativeTo(null);

        //Close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.rootPane.getContentPane().setBackground(Color.PINK);
    }

    void showFrame(){

        this.setVisible(true);
    }

    void hideFrame(){

        this.setVisible(false);
    }
}


