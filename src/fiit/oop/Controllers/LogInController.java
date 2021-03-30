package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.LogInScene;
import javafx.application.Platform;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LogInController {

    private LogInScene logInScene;
    private ModelApp modelApp;

    public LogInController(LogInScene logInScene, ModelApp modelApp) {

        this.logInScene = logInScene;
        this.modelApp = modelApp;

        logInScene.getLoginButton().setOnAction(e -> {

            String nameInput = logInScene.getNameInput().getText();
            String passInput = logInScene.getPassInput().getText();

            if(modelApp.checkUser(nameInput, passInput)){
                logInScene.getWindow().close();
                modelApp.logUser();
            }
        });

        logInScene.getExitButton().setOnAction(e -> {

            System.out.println("Ukončujem program..");

            try {
                serializable();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            Platform.exit();
            System.exit(0);

        });
    }

    private void serializable() throws ClassNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("modelAppData.txt");
        ObjectOutputStream oos  = new ObjectOutputStream(fos);
        oos.writeObject(modelApp);
        oos.close();
    }
}
