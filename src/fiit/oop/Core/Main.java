package fiit.oop.Core;

import fiit.oop.Controllers.LogInController;
import fiit.oop.Controllers.ManagerController;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.People.Manager;
import javafx.stage.Stage;
import javafx.application.Application;


public class Main extends Application {

    App app = new App();

    public static void main(String[] args) throws Exception {

        System.out.println("Staring OOP project..");
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        LogInScene logInScene = new LogInScene(primaryStage);
        LogInController logInController = new LogInController(logInScene, app);
        primaryStage = logInScene.getWindow();
        primaryStage.show();

    }

}