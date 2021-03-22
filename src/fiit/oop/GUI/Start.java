package fiit.oop.GUI;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start {

    public void start(Stage primaryStage){

        Stage window = primaryStage;

        LogInScene logIn = new LogInScene();
        Scene logInScene = logIn.makeLogIn(window);

        window.setScene(logInScene);
        window.show();
    }
}
