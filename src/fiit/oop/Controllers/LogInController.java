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

        // nastavenie akcie pre LoginButton
        logInScene.getLoginButton().setOnAction(e -> {

            // naskenovanie mena a hesla od používateľa
            String nameInput = logInScene.getNameInput().getText();
            String passInput = logInScene.getPassInput().getText();

            // skontrolovanie údajov a prihlásenie používateľa
            if (modelApp.checkUser(nameInput, passInput)) {
                logInScene.getWindow().close();
                modelApp.logUser();
            }
        });

        // nastavenie akcie pre ExitButton
        logInScene.getExitButton().setOnAction(e -> {

            System.out.println("Ukončujem program..");

            // serializácia modelu
            try {
                serializable();
            } catch (ClassNotFoundException | IOException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }

            // ukončenie behu progrmau
            System.exit(0);
        });
    }

    // metóda vykoná serializáciu modelu aplikácie
    private void serializable() throws ClassNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("modelAppData.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(modelApp);
        oos.close();
    }
}
