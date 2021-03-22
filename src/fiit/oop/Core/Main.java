package fiit.oop.Core;

import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.Start;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


public class Main extends Application {

    public static void main(String[] args) throws Exception {

        System.out.println("Staring OOP project..");
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        Start start = new Start();
        start.start(primaryStage);
    }

}

