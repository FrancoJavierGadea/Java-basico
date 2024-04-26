package JavaFX.Example2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {

    
    public static void main(String[] args) {
        
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        //Load FXML
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("main.fxml")
        );

        // MainController controller = new MainController();

        // loader.setController(controller);

        VBox root = loader.load();

        MainController controller = loader.getController();

        System.out.println(controller.name);

        //Scene
        Scene scene = new Scene(root);

        //Config stage
        stage.setScene(scene);
        
        stage.setTitle("Probando FXML");
        stage.show();
    }

}
