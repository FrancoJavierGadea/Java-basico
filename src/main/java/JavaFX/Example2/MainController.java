package JavaFX.Example2;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    public String name = "MainController";

    public Label label1 = null;

    @FXML
    public void buttonClicked(Event e){
        
        System.out.println("Button clicked");
        System.out.println(label1.getText());
    }

}
