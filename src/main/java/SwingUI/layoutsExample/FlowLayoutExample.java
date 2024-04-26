package SwingUI.layoutsExample;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.stream.IntStream;

public class FlowLayoutExample {
    
    static JPanel getPanel(){

        JPanel panel = new JPanel();

        //Layout
        FlowLayout layout = new FlowLayout();

            //Padding y gap
            // layout.setHgap(30);
            // layout.setVgap(30);

            //Justify-content
            layout.setAlignment(FlowLayout.LEFT);

        panel.setLayout(layout);

        //Add Elements
        IntStream.range(0, 7).forEach(n -> {

            JButton boton = new JButton("Boton " + n);

            panel.add(boton);
        });

        //Panel config
        panel.setSize(420, 100);
        panel.setBackground(Color.green);

        return panel;
    }

}
