package fiit.oop.GUI;

import fiit.oop.Core.App;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start {

    public static void start(Stage primaryStage, App app){

        Stage window = primaryStage;

        Scene logInScene = LogInScene.makeLogIn(window, app);

        window.setScene(logInScene);
        window.show();
    }
}
