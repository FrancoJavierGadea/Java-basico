package SwingUI.layoutsExample;

import javax.swing.JFrame;

public class main {

    static int WIDTH = 960;
    static int HEIGHT = 540;

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Layouts example");

        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setLayout(null);


        //frame.add(FlowLayoutExample.getPanel());

        frame.add(BorderLayoutExample.getPanel());
    }
    
}
