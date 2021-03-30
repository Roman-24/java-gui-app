package fiit.oop.Core;

import fiit.oop.Controllers.LogInController;
import fiit.oop.GUI.LogInScene;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {

    ModelApp modelApp = new ModelApp();

    public static void main(String[] args) {

        System.out.println("Staring OOP project..");
        launch(args);
    }

    public void start(Stage primaryStage) {

        LogInScene logInScene = new LogInScene(primaryStage);
        new LogInController(logInScene, modelApp);

    }

}