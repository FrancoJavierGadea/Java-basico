package SwingUI.layoutsExample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutExample {
    
    static JPanel getPanel(){

        JPanel panel = new JPanel();

        //Layout
        BorderLayout layout = new BorderLayout();


            //Padding y Gap
            layout.setVgap(20);
            layout.setHgap(20);

        panel.setLayout(layout);

        //Add Elements
        panel.add(new JButton("LINE_START"), BorderLayout.LINE_START);
        panel.add(new JButton("LINE_END"), BorderLayout.LINE_END);
        panel.add(new JButton("CENTER"), BorderLayout.CENTER);
        panel.add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
        panel.add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
 

        //Panel config
        panel.setSize(400, 400);
        panel.setBackground(Color.blue);

        return panel;
    }
}
