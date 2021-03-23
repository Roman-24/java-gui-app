package fiit.oop.Core;

import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.Start;
import fiit.oop.People.Designer;
import fiit.oop.People.Manager;
import fiit.oop.People.Tailor;
import javafx.concurrent.Worker;
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

import java.util.ArrayList;



public class Main extends Application {

    App app = new App();

    public static void main(String[] args) throws Exception {

        System.out.println("Staring OOP project..");
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Start.start(primaryStage, app);
    }

}