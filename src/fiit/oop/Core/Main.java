package fiit.oop.Core;

import fiit.oop.Controllers.LogInController;
import fiit.oop.GUI.LogInScene;

import javafx.stage.Stage;
import javafx.application.Application;

import java.io.*;

public class Main extends Application {

    ModelApp modelApp = new ModelApp();

    public static void main(String[] args)  {

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


        LogInScene logInScene = new LogInScene(primaryStage);
        new LogInController(logInScene, modelApp);

    }




}