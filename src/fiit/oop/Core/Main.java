package fiit.oop.Core;

import fiit.oop.Controllers.LogInController;
import fiit.oop.GUI.LogInScene;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.*;

public class Main extends Application {

    // vytvorenie modelu
    ModelApp modelApp = new ModelApp();

    public static void main(String[] args) {

        // spustenie gui
        System.out.println("Staring OOP project..");
        launch(args);
    }

    public void start(Stage primaryStage) {

        try {
            // deserializácia
            FileInputStream fis = new FileInputStream(new File("modelAppData.out"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            modelApp = (ModelApp) ois.readObject(); // down-casting object
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        // vytvorenie Login-u
        new LogInController(new LogInScene(primaryStage), modelApp);
    }

}